using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class GameManager : MonoBehaviour
{
    public static GameManager Instance;
    float _coolTime;
    public float maxTime;
    public wall wall;
    public Transform[] spawn;
    int rand1;
    int rand2;
    public sphere sphere;

    // Start is called before the first frame update
    void Start()
    {
        _coolTime = 0;
        Instance = this;
    }

    // Update is called once per frame
    void Update()
    {
        rand1 = Random.Range(0, 3);
        rand2 = Random.Range(3, 6);

        _coolTime += Time.deltaTime;

        if (_coolTime > maxTime)
        {
            Instantiate(wall, spawn[rand1].position, spawn[rand1].rotation);
            Instantiate(wall, spawn[rand2].position, spawn[rand2].rotation);

            _coolTime = 0;
        }

    }
}
