package kr.ac.mokwon.ch05_compoundbutton;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.txt01);
       /* CheckClickListener listener = new CheckClickListener();

        CheckBox box1 = findViewById(R.id.check01);
        CheckBox box2 = findViewById(R.id.check02);
        CheckBox box3 = findViewById(R.id.check03);
        CheckBox box4 = findViewById(R.id.check04);

        box1.setOnClickListener(listener);
        box2.setOnClickListener(listener);
        box3.setOnClickListener(listener);
        box4.setOnClickListener(listener);*/
    }

    public void OnClick(View view){
        RadioButton radioButton = (RadioButton) view;
        text.setText(radioButton.getText() + " : " + radioButton.isChecked());
    }

    public void OnSwitchClick(View view){
        Switch sw = (Switch) view;
        text.setText(sw.getText() + " : " + sw.isChecked());
    }

    public void OnToggleClick(View view){
        ToggleButton toggle = (ToggleButton) view;
        text.setText(toggle.getText() + " : " + toggle.isChecked());
    }
    /*
    class CheckClickListener implements View.OnClickListener{
        public void onClick(View view){
            CheckBox box = (CheckBox) view;

            int id = view.getId();
            if (id == R.id.check01) {
                if (box.isChecked()) {
                    text.setText(box.getText() + "ture");
                } else {
                    text.setText(box.getText() + "false");
                }
            } else if (id == R.id.check02) {
                if (box.isChecked()) {
                    text.setText(box.getText() + "ture");
                } else {
                    text.setText(box.getText() + "false");
                }
            } else if (id == R.id.check03) {
                if (box.isChecked()) {
                    text.setText(box.getText() + "ture");
                } else {
                    text.setText(box.getText() + "false");
                }
            } else if (id == R.id.check04) {
                if (box.isChecked()) {
                    text.setText(box.getText() + "ture");
                } else {
                    text.setText(box.getText() + "false");
                }
            }
        }
    }*/
}