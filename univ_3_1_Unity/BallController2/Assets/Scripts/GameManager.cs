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
        
        //�̵� �Ÿ� magnitude = ���� ���� ��ȯ
        float range = dir.magnitude;
        
        //���� ����ġ �߰�
        range += rangeOffset;

        //����ȭ
        Vector3 unitDir = dir.normalized;

        //����
        float height = range / 2 + start.y;

        //���̰� ���� �������� ���ٸ� ����ġ �߰�
        if(height < end.y)
        {
            height = end.y + maxHeightOffset;
        }

        //���� ��Ʈ -2(�߷� �ݴ�) * �߷� * ����
        newVel.y = Mathf.Sqrt(-2 * Physics.gravity.y * (height - start.y));

        //�Ÿ��� �� / ��Ʈ -2(�߷� �ݴ�) * ���� * �߷�
        float time1 = Mathf.Sqrt(-2 * (height - start.y) / Physics.gravity.y);
        
        //�Ÿ��� �� / ��Ʈ -2(�߷� �ݴ�) * ����(���� ��ġ - ���� ��ġ) * �߷�
        float time2 = Mathf.Sqrt(-2 * (height - end.y) / Physics.gravity.y);

        //�ð� �ݾ� ��ġ��
        float totalTime = time1 + time2;

        //��ü �Ÿ�
        float velocity = range / totalTime;

        //������ �ִ� �������� �����ֱ�
        newVel.x = velocity * unitDir.x;
        newVel.z = velocity * unitDir.z;

        return newVel;
    }

    //��� / ����Ƽ
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
