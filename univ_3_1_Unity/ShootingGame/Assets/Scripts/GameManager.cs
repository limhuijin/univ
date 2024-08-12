using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.SceneManagement;
using System;

public class GameManager : MonoBehaviour
{
    public static GameManager Instance;
    public float reTiem;
    float spawnTime;
    public Transform [] enemy;
    public Transform [] spawn;
    int rand1, rand2;
    public Transform _player;

    public int _life;
    public int _score;
    public Text scoreText;
    public GameObject[] lifeObj;
    public GameObject menuGameOver;
    public GameObject _boomEffect;

    public Action<int> _onScoreChange;

    private void Awake()
    {
        Instance = this;
    }

    // Start is called before the first frame update
    void Start()
    {
        spawnTime = 0;
        _life = 3;
        _score = 0;
        _onScoreChange?.Invoke(_score);
        //UpdateUIScore();

        UpdateUILife();
        menuGameOver.SetActive(false);
        _boomEffect.SetActive(false);
    }

    // Update is called once per frame
    void Update()
    {
        spawnTime += Time.deltaTime;

        if (spawnTime >= reTiem)
        {
            rand1 = UnityEngine.Random.Range(0, 3);
            rand2 = UnityEngine.Random.Range(0, 7);

            Vector2 vec = _player.position - spawn[rand2].position;
            Quaternion rot = Quaternion.identity;

            float angle = Mathf.Atan2(vec.y, vec.x) * Mathf.Rad2Deg;
            rot.eulerAngles = new Vector3(0, 0, angle + 90);

            Instantiate(enemy[rand1], spawn[rand2].position, rot);

            spawnTime = 0;
        }

    }

    void UpdateUIScore()
    {
        scoreText.text = _score.ToString();
    }

    void UpdateUILife()
    {
        for(int i = 0; i < 3; i++)
        {
            if(i < _life)
            {
                lifeObj[i].SetActive(true);
            }
            else
            {
                lifeObj[i].SetActive(false);
            }
        }
    }

    public void addScore(int score)
    {
        _score += score;
        _onScoreChange.Invoke(_score);
        //UpdateUIScore();
    }

    public bool setLife()
    {
        _life--;
        UpdateUILife();

        if(_life <= 0)
        {
            menuGameOver.SetActive(true);
            Time.timeScale = 0;
            return true; 
        }

        return false;
    }

    public void ButtonAct_Restart()
    {
        Time.timeScale = 1;
        SceneManager.LoadScene(0);
    }

    public void BoomStart()
    {
        _boomEffect.SetActive(true);
        GameObject[] enemys = GameObject.FindGameObjectsWithTag("enemy");
        for(int i = 0; i < enemys.Length; i++)
        {
            EnemyController controller = enemys[i].GetComponent<EnemyController>();

            if(controller)
            {
                controller.OnHit(10);
            }
        }

        GameObject[] bullets = GameObject.FindGameObjectsWithTag("enemyBullet");
        for (int i = 0; i < bullets.Length; i++)
        {
            Destroy(bullets[i]);
        }

        Invoke("OffBoomEffect", 3);
    }

    void OffBoomEffect()
    {
        _boomEffect.SetActive(false);
    }
}
