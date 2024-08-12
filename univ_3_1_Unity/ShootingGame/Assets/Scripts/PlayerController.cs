using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerController : MonoBehaviour
{
    public float _speed;
    public Vector2 minBoundary;
    public Vector2 maxBoundary;
    Animator _anim;
    public Transform _myTF;
    public Transform _bullet0;
    public Transform _bullet1;
    float _coolTime;
    public float maxTime;
    public int level;
    bool _dontKillTime = false;
    public SpriteRenderer renderer;


    private void Awake()
    {
        _anim = GetComponent<Animator>();
        _coolTime = 0;
        level = 0;
    }


    // Update is called once per frame
    void Update()
    {
        float h = Input.GetAxisRaw("Horizontal");
        float V = Input.GetAxisRaw("Vertical");

        Vector3 nextPos = new Vector3(h, V, 0) * _speed * Time.deltaTime;

        _myTF.position += nextPos;
        
        Vector3 pos = _myTF.position;

        pos.x = Mathf.Clamp(pos.x, minBoundary.x, maxBoundary.x);
        pos.y = Mathf.Clamp(pos.y, minBoundary.y, maxBoundary.y);

        _myTF.position = pos;


        if (Input.GetButtonDown("Horizontal") || Input.GetButtonUp("Horizontal"))
        {
            _anim.SetInteger("input", (int)h);
        }


        if (Input.GetButton("Fire1"))
        {
            _coolTime += Time.deltaTime;

            if (_coolTime > maxTime && level == 0)
            {
                //Instantiate(_bullet0, _myTF.position, _myTF.rotation);
                PoolManager.Spawn(_bullet0.gameObject, _myTF.position, _myTF.rotation);
                _coolTime = 0;
            }
            else if (_coolTime > maxTime && level == 1)
            {
                //Instantiate(_bullet0, _myTF.position + new Vector3(-0.1f, 0, 0), _myTF.rotation);
                //Instantiate(_bullet0, _myTF.position + new Vector3(0.1f, 0, 0), _myTF.rotation);
                PoolManager.Spawn(_bullet0.gameObject, _myTF.position + new Vector3(-0.1f, 0, 0), _myTF.rotation);
                PoolManager.Spawn(_bullet0.gameObject, _myTF.position + new Vector3(0.1f, 0, 0), _myTF.rotation);
                _coolTime = 0;
            }
            else if (_coolTime > maxTime && level == 2)
            {
                //Instantiate(_bullet1, _myTF.position, _myTF.rotation);
                //Instantiate(_bullet0, _myTF.position + new Vector3(-0.2f, 0, 0), _myTF.rotation);
                //Instantiate(_bullet0, _myTF.position + new Vector3(0.2f, 0, 0), _myTF.rotation);
                PoolManager.Spawn(_bullet1.gameObject, _myTF.position, _myTF.rotation);
                PoolManager.Spawn(_bullet0.gameObject, _myTF.position + new Vector3(-0.2f, 0, 0), _myTF.rotation);
                PoolManager.Spawn(_bullet0.gameObject, _myTF.position + new Vector3(0.2f, 0, 0), _myTF.rotation);
                _coolTime = 0;
            }
        }

    }

    private void OnTriggerEnter2D(Collider2D collision)
    {
        if(_dontKillTime)
        {
            return;
        }

        switch (collision.tag)
        {
            case "enemyBullet":
            case "enemy":
                Destroy(collision.gameObject);
                if (GameManager.Instance.setLife() == false)
                {
                    gameObject.SetActive(false);
                    Invoke("ShowPlayer", 1);
                }
                break;
            case "item":
                Item item = collision.GetComponent<Item>();
                switch(item._type)
                {
                    case ItemType.coin:
                        GameManager.Instance.addScore(100);
                        Destroy(collision.gameObject);
                        break;
                    case ItemType.power:
                        if(level <= 2)
                        {
                            level++;
                        }
                        Destroy(collision.gameObject);
                        break;
                    case ItemType.boom:
                        GameManager.Instance.BoomStart();
                        Destroy(collision.gameObject);
                        break;
                }
                break;
        }
    }

    void ShowPlayer()
    {
        _myTF.position = new Vector3(0, -1.25f, 0);
        gameObject.SetActive(true);
        StartCoroutine(DoDontKill());
    }

    IEnumerator DoDontKill()
    {
        _dontKillTime = true;
        renderer.color = new Color(1, 1, 1, 0);
        yield return new WaitForSeconds(0.2f);
        renderer.color = new Color(1, 1, 1, 1);
        yield return new WaitForSeconds(0.2f);
        renderer.color = new Color(1, 1, 1, 0);
        yield return new WaitForSeconds(0.2f);
        renderer.color = new Color(1, 1, 1, 1);
        yield return new WaitForSeconds(0.2f);
        renderer.color = new Color(1, 1, 1, 0);
        yield return new WaitForSeconds(0.2f);
        renderer.color = new Color(1, 1, 1, 1);
        _dontKillTime = false;
    }
}
