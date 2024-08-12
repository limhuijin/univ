using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BulletController : MonoBehaviour
{
    public float _speed;
    public Rigidbody2D _rd;
    public Transform _myTF;
    public int dmg;

    // Start is called before the first frame update
    void OnEnable()
    {
        _rd.AddForce(_myTF.up * _speed, ForceMode2D.Impulse);
    }

}
