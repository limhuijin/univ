using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PickupControler : MonoBehaviour
{
    public Vector3 _speed;

    // Update is called once per frame

    private void Start()
    {
        _speed = new Vector3(15, 30, 15);
    }

    void Update()
    {
        transform.Rotate(_speed * Time.deltaTime);
    }
}
