using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Dongle : MonoBehaviour
{
    Transform MyTF;
    public Rigidbody2D rd;
    public bool isDrag;
    public int Level;
    Animator anim;
    public bool isMerge;
    CircleCollider2D circle;
    public ParticleSystem effect;
    public float deadTime;
    SpriteRenderer sprite;


    void Awake()
    {
        MyTF = transform;
        rd = GetComponent<Rigidbody2D>();
        anim = GetComponent<Animator>();
        circle = GetComponent<CircleCollider2D>();
        sprite = GetComponent<SpriteRenderer>();
    }

    private void OnEnable()
    {
        anim.SetInteger("Level", Level);
    }

    void Update()
    {
        if (isDrag)
        {
            Vector3 mousePos = Camera.main.ScreenToWorldPoint(Input.mousePosition);
            mousePos.z = 0;
            mousePos.y = 8;
            mousePos.x = Mathf.Clamp(mousePos.x, -4.2f + MyTF.localScale.x / 2, 4.2f - MyTF.localScale.x / 2);
            MyTF.position = Vector3.Lerp(MyTF.position, mousePos, 0.2f);
        }
    }

    public void Drag()
    {
        isDrag = true;
    }

    public void Drop()
    {
        isDrag = false;
        rd.simulated = true;
    }

    private void OnCollisionStay2D(Collision2D collision)
    {
        if(collision.gameObject.tag.Equals("Dongle"))
        {
            Dongle dongle = collision.gameObject.GetComponent<Dongle>();
            
            if(dongle != null)
            {
                if(Level == dongle.Level && isMerge == false && dongle.isMerge == false && Level < 7)
                {
                    float myX = MyTF.position.x;
                    float myY = MyTF.position.y;
                    float x = dongle.MyTF.position.x;
                    float y = dongle.MyTF.position.y;

                    if(myY < y || (myY == y && myX > x))
                    {
                        dongle.hide(MyTF.position);
                        LevelUp();
                    }
                }
            }
        }
    }

    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.gameObject.tag.Equals("Dongle"))
        {
            GameManager.Instance.SFXPlay(GameManager.SFX.attach);
        }
    }

    private void OnTriggerStay2D(Collider2D collision)
    {
        if (collision.tag.Equals("Finish"))
        {
            deadTime += Time.deltaTime;

            if(deadTime > 2)
            {
                sprite.color = Color.red;
            }
            
            if(deadTime > 5)
            {
                GameManager.Instance.gameOver();
            }
        }
    }

    private void OnTriggerExit2D(Collider2D collision)
    {
        if (collision.tag.Equals("Finish"))
        {
            deadTime = 0;
            sprite.color = Color.white;
        }
    }

    public void hide(Vector3 pos)
    {
        isMerge = true;
        rd.simulated = false;
        circle.enabled = false;

        StartCoroutine(doHide(pos));
    }

    public void hide()
    {
        isMerge = true;
        rd.simulated = false;
        circle.enabled = false;
        anim.enabled = false;

        StartCoroutine(doHide());
    }

    IEnumerator doHide(Vector3 pos)
    {
        int frameCount = 0;
        
        while(frameCount < 20)
        {
            frameCount++;
            MyTF.position = Vector3.Lerp(MyTF.position, pos, 0.5f);

            yield return null;
        }

        isMerge = false;
        gameObject.SetActive(false);
    }

    IEnumerator doHide()
    {
        int frameCount = 0;

        while (frameCount < 20)
        {
            frameCount++;
            MyTF.localScale = Vector3.Lerp(MyTF.localScale, Vector3.zero, 0.2f);

            yield return new WaitForSeconds(0.03f);
        }

        isMerge = false;
        gameObject.SetActive(false);
    }

    void LevelUp()
    {
        isMerge = true;
        rd.velocity = Vector2.zero;
        rd.angularVelocity = 0;
        GameManager.Instance.score += (int)(Mathf.Pow(2, (Level + 1)));
        GameManager.Instance.printScore();

        StartCoroutine(doLevelUp());
    }

    IEnumerator doLevelUp()
    {
        yield return new WaitForSeconds(0.2f);

        anim.SetInteger("Level", ++Level);
        GameManager.Instance.maxLevel = Mathf.Max(Level, GameManager.Instance.maxLevel);
        effectPlay();

        GameManager.Instance.SFXPlay(GameManager.SFX.level);

        yield return new WaitForSeconds(0.3f);

        isMerge = false;
    }

    void effectPlay()
    {
        effect.transform.position = MyTF.position;
        effect.transform.localScale = MyTF.localScale;
        effect.Play();
    }
}
