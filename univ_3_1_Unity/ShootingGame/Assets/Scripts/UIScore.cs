using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class UIScore : MonoBehaviour
{
    public Text _scoreText;

    private void OnEnable()
    {
        GameManager.Instance._onScoreChange += UpdateUI;
    }

    private void OnDisable()
    {
        GameManager.Instance._onScoreChange -= UpdateUI;
    }

    void UpdateUI(int score)
    {
        _scoreText.text = score.ToString();
    }
}
