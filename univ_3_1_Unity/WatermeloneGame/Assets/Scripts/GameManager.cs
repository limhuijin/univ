using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.SceneManagement;


public class GameManager : MonoBehaviour
{
    public static GameManager Instance;
    public Dongle LastDongle;
    public GameObject DonglePref;
    public Transform DongleGroup;
    public GameObject particlePref;
    public Transform particleGroup;
    public int maxLevel;
    bool isOver;

    public AudioSource BGMPlayer;
    public AudioSource[] EffectgPlayer;
    public AudioClip[] AudioClips;
    public Text scoreText;
    public int score;
    int num;
    public GameObject End;
    public Button button;
    public Text buttonText;

    public enum SFX
    {
        level,
        next,
        attach,
        button,
        over,
    }

    Dictionary<SFX, float> SFXTime = new Dictionary<SFX, float>();
    int currentIndex;

    void Start()
    {
        End.SetActive(false);
        button.gameObject.SetActive(false);
        BGMPlayer.Play();
        maxLevel = 2;
        NextDongle();
        score = 0;
    }

    private void Awake()
    {
        Instance = this;
    }

    void NextDongle()
    {
        if (isOver)
        {
            return;
        }

        LastDongle = GetDongle();
        LastDongle.Level = Random.Range(0, maxLevel);
        LastDongle.gameObject.SetActive(true);
        SFXPlay(SFX.next);
    }

    Dongle GetDongle()
    {
        GameObject particle = Instantiate(particlePref, particleGroup);

        GameObject clone = Instantiate(DonglePref, DongleGroup);
        Dongle dongle = clone.GetComponent<Dongle>();
        dongle.effect = particle.GetComponent<ParticleSystem>();

        return dongle;
    }

    public void TouchDown()
    {
        if(LastDongle == null)
        {
            return;
        }

        LastDongle.Drag();
    }
    public void TouchUp()
    {
        if (LastDongle == null)
        {
            return;
        }

        LastDongle.Drop();
        LastDongle = null;
        Invoke("NextDongle", 2.5f);
    }

    public void gameOver()
    {
        if (isOver)
        {
            return;
        }

        isOver = true;

        StartCoroutine(DoGameOver());
        SFXPlay(SFX.over);
    }

    IEnumerator DoGameOver()
    {
        Dongle[] dongles = FindObjectsOfType<Dongle>();

        
        for (int i = 0; i < dongles.Length; i++)
        {
            if (dongles[i].rd.simulated == true)
            {
                num = dongles[i].Level;
                score += (int)(Mathf.Pow(2, num));
                printScore();
            }
                dongles[i].hide();
                yield return new WaitForSeconds(0.1f);
        }


        buttonText.text = "다시 하기\n점수 : " + score;
        End.gameObject.SetActive(true);
        button.gameObject.SetActive(true);
        BGMPlayer.Stop();
    }

    public void SFXPlay(SFX sfx)
    {
        if (SFXTime.ContainsKey(sfx) && (Time.time - SFXTime[sfx]) < 0.2f)
        {
            return;
        }

        switch (sfx)
        {
            case SFX.level:
                EffectgPlayer[currentIndex].clip = AudioClips[Random.Range(0, 3)];
                break;
            case SFX.next:
                EffectgPlayer[currentIndex].clip = AudioClips[3];
                break;
            case SFX.attach:
                EffectgPlayer[currentIndex].clip = AudioClips[4];
                break;
            case SFX.button:
                EffectgPlayer[currentIndex].clip = AudioClips[5];
                break;
            case SFX.over:
                EffectgPlayer[currentIndex].clip = AudioClips[6];
                break;
        }

        EffectgPlayer[currentIndex].Play();
        currentIndex = (currentIndex + 1) % EffectgPlayer.Length;
        SFXTime[sfx] = Time.time;
    }

    public void printScore()
    {
        scoreText.text = score + "";
    }

    public void reStart()
    {
        SceneManager.LoadScene(0);
    }
}
