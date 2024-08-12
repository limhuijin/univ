using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Player : MonoBehaviour
{
    public int speed;
    public Transform myTF;
    public Bullet bullet;
    public bool isBullet;

    // Update is called once per frame
    private void Start()
    {
        speed = 10;
        isBullet = true;
    }

    void Update()
    {
        float V = Input.GetAxisRaw("Vertical");

        Vector3 nextPos = new Vector3(0, V, 0) * speed * Time.deltaTime;

        myTF.position += nextPos;

        Vector3 pos = myTF.position;

        pos.y = Mathf.Clamp(pos.y, -10, 10);

        myTF.position = pos;

        if (Input.GetButtonDown("Fire1"))
        {
            if (isBullet == true)
            {
                Instantiate(bullet, myTF.position + new Vector3(-2.5f, 0, 0), myTF.rotation);
                isBullet = false;
            }
        }
    }

}
