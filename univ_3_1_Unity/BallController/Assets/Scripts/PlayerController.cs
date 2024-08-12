using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class PlayerController : MonoBehaviour
{
    public Text _scoreText;
    public Text _scoreText2;
    public float speed;
    public int _score;

    // Start is called before the first frame update
    private void Awake()
    {
        speed = 10;
        _score = 0;
    }

    private void FixedUpdate()
    {
        float moveH = Input.GetAxis("Horizontal");
        float moveV = Input.GetAxis("Vertical");
        
        Rigidbody rd = GetComponent<Rigidbody>();
        rd.AddForce(new Vector3(moveH, 0, moveV) * speed);
    }

    private void OnTriggerEnter(Collider other)
    {
        if(other.tag.Equals("pickup"))
        {
            Destroy(other.gameObject);
            _score++;

            _scoreText.text = "점수 : " + _score.ToString();
        }

        if(_score >= 6)
        {
            _scoreText.text = "";
            _scoreText2.text = "게임 클리어";
        }
    }


    /* 이벤트 종류
    private void OnCollisionEnter(Collision collision)
    {
        
    }

    private void OnCollisionExit(Collision collision)
    {
        
    }

    private void OnCollisionStay(Collision collision)
    {
        
    }

    private void OnTriggerEnter(Collider other)
    {

    }

    private void OnTriggerExit(Collider other)
    {
        
    }

    private void OnTriggerStay(Collider other)
    {
        
    }
    */
}
