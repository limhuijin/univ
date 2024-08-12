using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class wall : MonoBehaviour
{
    public Rigidbody _rd;
    public int speed;
    bool isOn = true;

    // Start is called before the first frame update
    // Update is called once per frame


    void Update()
    {
        _rd.AddForce(new Vector3(-10, 0, 0) * speed);

        if(transform.position.x < 0)
        {
            if (isOn == true)
            {
                GameManager.Instance.sphere.scoreUp();
                isOn = false;
            }
            
        }
    }

}
