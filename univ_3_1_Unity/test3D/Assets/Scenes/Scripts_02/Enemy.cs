using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Enemy : MonoBehaviour
{
    public Rigidbody _rd;
    public Transform _myTF;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        _rd.AddForce(_myTF.up * 2, ForceMode.Force);
    }

    private void OnTriggerEnter(Collider collision)
    {
        switch (collision.tag)
        {
            case "bullet":
                GameManager.Instance.sum();
                Destroy(collision.gameObject);
                break;
        }
    }
}
