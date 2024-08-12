using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class EnemyController : MonoBehaviour
{
    public float _speed;
    public Rigidbody2D _rd;
    public Transform _myTF;
    public int HP;
    public int enemyScore;
    public Sprite[] sprite;
    public SpriteRenderer renderer;
    float _coolTime;
    public float maxTime;
    public Transform _enemyBullet0;

    // Start is called before the first frame update
    void Start()
    {
        _rd.velocity = _myTF.up * -_speed;
        _coolTime = 0;
    }

    private void Update()
    {

        if (_enemyBullet0 == null)
        {
            return;
        }
        _coolTime += Time.deltaTime;

        if (_coolTime > maxTime)
        {
            Vector2 vec = GameManager.Instance._player.position - _myTF.position;
            Quaternion rot = Quaternion.identity;

            float angle = Mathf.Atan2(vec.y, vec.x) * Mathf.Rad2Deg;
            rot.eulerAngles = new Vector3(0, 0, angle - 90);

            Instantiate(_enemyBullet0, _myTF.position, rot);

            _coolTime = 0;
        }

    }
    private void OnTriggerEnter2D(Collider2D collision)
    {
        switch (collision.tag)
        {
            case "bullet":
                BulletController bullet = collision.GetComponent<BulletController>();
                OnHit(bullet.dmg);
                //Destroy(collision.gameObject);
                PoolManager.Despawn(gameObject);
                break;
        }
    }

    public void OnHit(int dmg)
    {
        HP -= dmg;

        if (HP <= 0)
        {
            GameManager.Instance.addScore(enemyScore);
            Destroy(gameObject);
        }
        else
        {
            renderer.sprite = sprite[1];
            Invoke("ReturnSprite", 0.2f);
        }
    }

    void ReturnSprite()
    {
        renderer.sprite = sprite[0];
    }
}
