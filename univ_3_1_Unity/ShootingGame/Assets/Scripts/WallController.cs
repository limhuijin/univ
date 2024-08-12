using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class WallController : MonoBehaviour
{
    // Start is called before the first frame update
    private void OnTriggerEnter2D(Collider2D collision)
    {
        switch (collision.tag)
        {
            case "enemyBullet":
            case "enemy":
                Destroy(collision.gameObject);
                break;
            case "bullet":
                PoolManager.Despawn(collision.gameObject);
                break;
        }
    }
}
