using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BackgroundController : MonoBehaviour
{
    public Transform background;
    public int speed;

    // Update is called once per frame
    void Update()
    {
        background.Translate(new Vector3(0, -speed, 0) * Time.deltaTime);

        if (background.position.y < -12)
        {
            background.position += new Vector3(0, 24, 0);
        }
    }
}
