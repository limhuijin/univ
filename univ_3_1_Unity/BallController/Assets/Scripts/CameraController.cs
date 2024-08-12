using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CameraController : MonoBehaviour
{
    public Transform _player;
    public Vector3 _offset;

    private void Start()
    {
        _offset = _player.position - transform.position;
    }

    private void LateUpdate()
    {
        transform.position = _player.position - _offset;
    }
}
