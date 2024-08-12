using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class GameManager : MonoBehaviour
{
    public Rigidbody ball;
    public Transform startTF;
    public Transform endTF;
    public LineRenderer lineRenderer;
    public int resolution = 30;

    // Update is called once per frame
    void Update()
    {
        if(Input.GetKeyDown(KeyCode.Space))
        {
            ball.position = startTF.position + new Vector3(0, 0.5f, 0);
            ball.velocity = findInitialVelocity(startTF.position, endTF.position);
        }
        DrawPath();
    }

    Vector3 findInitialVelocity(Vector3 start, Vector3 end, 
        float maxHeightOffset = 0.6f, float rangeOffset = 0.11f)
    {
        Vector3 newVel = new Vector3();

        Vector3 dir = new Vector3(end.x - start.x, 0, end.z - start.z);
        
        //이동 거리 magnitude = 벡터 길이 반환
        float range = dir.magnitude;
        
        //길이 보정치 추가
        range += rangeOffset;

        //정규화
        Vector3 unitDir = dir.normalized;

        //높이
        float height = range / 2 + start.y;

        //높이가 도착 지점보다 낮다면 보정치 추가
        if(height < end.y)
        {
            height = end.y + maxHeightOffset;
        }

        //높이 루트 -2(중력 반대) * 중력 * 높이
        newVel.y = Mathf.Sqrt(-2 * Physics.gravity.y * (height - start.y));

        //거리의 반 / 루트 -2(중력 반대) * 높이 * 중력
        float time1 = Mathf.Sqrt(-2 * (height - start.y) / Physics.gravity.y);
        
        //거리의 반 / 루트 -2(중력 반대) * 높이(현재 위치 - 도착 위치) * 중력
        float time2 = Mathf.Sqrt(-2 * (height - end.y) / Physics.gravity.y);

        //시간 반씩 합치기
        float totalTime = time1 + time2;

        //전체 거리
        float velocity = range / totalTime;

        //기울어져 있는 단위벡터 나눠주기
        newVel.x = velocity * unitDir.x;
        newVel.z = velocity * unitDir.z;

        return newVel;
    }

    //경로 / 지피티
    void DrawPath()
    {
        Vector3 initialVelocity = findInitialVelocity(startTF.position, endTF.position);
        Vector3[] pathPoints = CalculatePath(startTF.position, initialVelocity, resolution);

        lineRenderer.positionCount = pathPoints.Length;
        lineRenderer.SetPositions(pathPoints);
    }

    Vector3[] CalculatePath(Vector3 start, Vector3 initialVelocity, int resolution)
    {
        Vector3[] path = new Vector3[resolution];
        path[0] = start;

        float timeStep = 2 * initialVelocity.y / (-Physics.gravity.y * (resolution - 1));
        for (int i = 1; i < resolution; i++)
        {
            float t = i * timeStep;
            path[i] = start + t * initialVelocity + 0.5f * Physics.gravity * t * t;
        }

        return path;
    }
}
