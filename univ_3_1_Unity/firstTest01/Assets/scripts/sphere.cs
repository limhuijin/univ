using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class sphere : MonoBehaviour
{
    public Text _scoreText;
    public Text _scoreText2;
    public Rigidbody _rd;
    public int speed;
    public float _score;
    float _coolTime;
    public float maxTime;
    bool gameOver = false;


    private void Awake()
    {
        speed = 10;
        _score = 0;
        _coolTime = 0;
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetButtonDown("Fire1"))
        {
            _rd.AddForce(new Vector3(0, 60, 0) * speed);
        }

        _coolTime += Time.deltaTime;
    }

    private void OnTriggerEnter(Collider other)
    {
        if (other.tag.Equals("Sphere"))
        {
            _scoreText.text = "점수 : " + _score.ToString();
            _scoreText2.text = "GAME OVER";
            gameOver = true;
        }
    }

    public void scoreUp()
    {
        if (gameOver == false)
        {
            _score += 0.5f;
            _scoreText.text = "점수 : " + _score.ToString();
        }
    }
}
    