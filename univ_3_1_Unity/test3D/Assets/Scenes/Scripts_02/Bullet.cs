using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Bullet : MonoBehaviour
{
    public float _speed;
    public Rigidbody _rd;
    public Transform _myTF;

    // Update is called once per frame
    void Update()
    {
        _rd.AddForce(_myTF.up * _speed, ForceMode.Force);

        if (_myTF.position.x < -10)
        {
            GameManager.Instance.noBullet();
            Destroy(this);
        }
    }
}
