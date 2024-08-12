using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class GameManager : MonoBehaviour
{
    int score;
    public static GameManager Instance;
    public Enemy enemy;
    public Player player;
    public float spawTime = 0;
    public float maxTime = 2;
    public Rigidbody myTF;
    public Text text;

    // Start is called before the first frame update
    void Start()
    {
        score = 0;
    }

    // Update is called once per frame
    void Update()
    {
        spawTime += Time.deltaTime;

        if(spawTime > maxTime)
        {
            Instantiate(enemy, new Vector3(Random.Range(-8, 8), -15, 0), myTF.rotation);
            spawTime -= 2;
        }
    }

    public void noBullet()
    {
        player.isBullet = true;
    }
    public void sum()
    {
        score += 100;
        text.text = score + "";
    }
}  
