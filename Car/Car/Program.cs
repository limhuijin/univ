/*
   - SwipeCar 게임
   - [알고리즘]
      - 게임이 시작되면 화면 왼쪽 아래에 자동차가 표시되고, 화면을 스와이프하면 자동차가 달리기 시작하다 점차 감속하면서 멈춤
      - 스와이프의 길이를 조절해서 자동차 주행거리를 바꿀 수 있음
      - 화면 오른쪽 아래에는 깃발이 표시되고 화면 중앙에는 자동차와 깃발 사이의 거리가 표시
   - [디자인]
      - [1단계] : 화면에 놓일 오브젝트를 모두 나열, 자동차, 깃발, 지면, 거리표시 UI
      - [2단계] : 오브젝트를 움직일 수 있는 컨트롤러 스크립트 작성 : 자동차 컨트롤러
      - [3단계] : 오브젝트를 자동으로 생성할 수 있도록 제너레이터 스크립트 작성, 자동차와 깃발 사이의 거리를 UI로 표시해야 하므로 감독 스크립트를 작성
      - [4단계] : UI를 갱신할 수 있도록 감독 스크립트 작성, 자동차와 깃발 사이의 거리를 UI로 표시해야 하므로 감독 스크립트를 작성
   - 프로젝트
   - 프로젝트 명칭 : Ch04_SwipeCar_20231106
   - 씬 명칭 : GameScene
   - 클래스 명칭 : CarController
 */

/*
    컬렉션(Collections)은 C#에서 지원하는 자료구조 클래스
    제너릭 컬렉션은 using 지시문으로 System.Collections.Generic를 선언해 주어야 하는데
    유니티에서 새 C# 스크립트를 만들면, 자동적으로 선언됨
    첫줄의 using은 다른 lib의 코드를 import하는 기능이며 public class 는 자바의 객체 역할을, 마지막으로 void Start()는 자바의 메소드를 의미
    System.Collections, System.Collections.Generic은 데이터를 저장하는 자료구조형을 제공
*/

using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CarController : MonoBehaviour
{
    float fCarSpeed = 0.0f;
    float fSwipeLength = 0.0f;

    Vector2 vMouseStartPosition = Vector2.zero;
    Vector2 vMouseEndPosition = Vector2.zero;

    // Start is called before the first frame update
    void Start()
    {
        /*
            - 프레임레이트를 60으로 고정
            - 어떤 성능의 컴퓨터에서 동작해도 같은 속도로 움직이도록 하는 처리
        */
        Application.targetFrameRate = 60;
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetMouseButtonDown(0))
        {
            vMouseStartPosition = Input.mousePosition;
        }
        else if (Input.GetMouseButtonUp(0))
        {
            /*
          * 마우스 버튼에서 손가락을 떼었을 때, 좌표, 도착점
          * 도착 지점의 마우스 좌표 : Input.mousePosition
          */
            vMouseEndPosition = Input.mousePosition;

            //스와이프 길이 = 도착점 - 출발점
            fSwipeLength = vMouseEndPosition.x - vMouseStartPosition.x;

            //스와이프 길이를 처음 속도로 변경
            fCarSpeed = fSwipeLength / 2400.0f;

            //GetComponent<AudioSource>().Play();
        }

        transform.Translate(fCarSpeed, 0, 0);

        fCarSpeed *= 0.98f;
    }

    float CarSpeed(void)
    {

    }
}