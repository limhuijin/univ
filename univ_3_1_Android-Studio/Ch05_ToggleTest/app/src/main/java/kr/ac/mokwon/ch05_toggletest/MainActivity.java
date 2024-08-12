package kr.ac.mokwon.ch05_toggletest;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public boolean isToggle01 = true;
    public boolean isToggle02 = true;
    Switch sw;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw = findViewById(R.id.switch01);
    }

    public void OnToggleClick01(View view){
        ToggleButton toggle01 = (ToggleButton) view;
        if (toggle01.isChecked() == false){
            isToggle01 = true;
        }
        else{
            isToggle01 = false;
        }

        if ((isToggle01 == true && isToggle02 == true) || (isToggle01 == false && isToggle02 == false)){
            sw.setChecked(false);
        }
        else{
            sw.setChecked(true);
        }
    }
    public void OnToggleClick02(View view){
        ToggleButton toggle02 = (ToggleButton) view;
        if (toggle02.isChecked() == false){
            isToggle02 = true;
        }
        else{
            isToggle02 = false;
        }

        if ((isToggle01 == true && isToggle02 == true) || (isToggle01 == false && isToggle02 == false)){
            sw.setChecked(false);
        }
        else{
            sw.setChecked(true);
        }
    }
}