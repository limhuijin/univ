using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Item : MonoBehaviour
{
    public float _speed;
    public Rigidbody2D _rd;
    public Transform _myTF;
    public ItemType _type;

    void Start()
    {
        _rd.velocity = _myTF.up * -_speed;
    }

}

public enum ItemType
{
    none,
    coin,
    boom,
    power
}