package kr.ac.mokwon.ch03_counter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TextView _text;
    int _counter = 0;
    ImageView img;

    Random random = new Random();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _text = findViewById(R.id.text);
        img = findViewById(R.id.img);
        Button btn01 = findViewById(R.id.add);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _counter = random.nextInt(6) + 1;
                _text.setText(_counter + "");
                if (_counter == 1){
                    img.setImageResource(R.drawable.one);
                }
                else if (_counter == 2){
                    img.setImageResource(R.drawable.two);
                }
                else if (_counter == 3){
                    img.setImageResource(R.drawable.three);
                }
                else if (_counter == 4){
                    img.setImageResource(R.drawable.four);
                }
                else if (_counter == 5){
                    img.setImageResource(R.drawable.five);
                }
                else{
                    img.setImageResource(R.drawable.six);
                }
            }
        });

        Button btn02 = findViewById(R.id.sub);
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _counter = random.nextInt(6) + 1;
                _text.setText(_counter + "");
                if (_counter == 1){
                    img.setImageResource(R.drawable.one);
                }
                else if (_counter == 2){
                    img.setImageResource(R.drawable.two);
                }
                else if (_counter == 3){
                    img.setImageResource(R.drawable.three);
                }
                else if (_counter == 4){
                    img.setImageResource(R.drawable.four);
                }
                else if (_counter == 5){
                    img.setImageResource(R.drawable.five);
                }
                else{
                    img.setImageResource(R.drawable.six);
                }
            }
        });
    }

}