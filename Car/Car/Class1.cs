using System.Collections;
using System.Collections.Generic;
using UnityEngine;

using UnityEngine.UI;

public class GameDirector : MonoBehaviour
{
    GameObject gCar = null;         //자동차 GameObject 변수
    GameObject gFlag = null;        //깃발 GameObject 변수
    GameObject gDistance = null;    //거리 GameObject 변수

    float fDistanceLength = 0.0f;

    // Start is called before the first frame update
    void Start()
    {
        gCar = GameObject.Find("car");
        gFlag = GameObject.Find("flag");
        gDistance = GameObject.Find("txtDistance");
    }

    // Update is called once per frame
    void Update()
    {
        fDistanceLength = gFlag.transform.position.x - gCar.transform.position.x;

        gDistance.GetComponent<Text>().text = "목표 지점까지 " + fDistanceLength.ToString("F2") + 'm';
    }
}