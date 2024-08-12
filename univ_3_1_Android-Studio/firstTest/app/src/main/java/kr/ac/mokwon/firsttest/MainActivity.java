package kr.ac.mokwon.firsttest;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.ColorKt;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sum = 0;

        Button btn = findViewById(R.id.btn);
        TextView text01 = findViewById(R.id.one);
        TextView text02 = findViewById(R.id.two);
        TextView text03 = findViewById(R.id.three);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum++;

                if (sum == 3){

                    text01.setBackgroundColor(Color.rgb(127, 0, 0));
                    text02.setBackgroundColor(Color.rgb(0, 127, 0));
                    text03.setBackgroundColor(Color.rgb(0, 0, 127));
                    sum = 0;
                }
                else if (sum == 2){
                    text01.setBackgroundColor(Color.rgb(0, 127, 0));
                    text02.setBackgroundColor(Color.rgb(0, 0, 127));
                    text03.setBackgroundColor(Color.rgb(127, 0, 0));
                }
                else if (sum == 1){
                    text01.setBackgroundColor(Color.rgb(0, 0, 127));
                    text02.setBackgroundColor(Color.rgb(127, 0, 0));
                    text03.setBackgroundColor(Color.rgb(0, 127, 0));
                }

            }
        });
    }
}