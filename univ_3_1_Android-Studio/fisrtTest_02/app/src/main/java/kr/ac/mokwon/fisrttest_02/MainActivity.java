package kr.ac.mokwon.fisrttest_02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ActivityResultLauncher<Intent> launcher;
    String arr01 [] = new String[5];
    String arr02 [] = new String[5];
    TextView text01;
    TextView text02;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text01 = findViewById(R.id.text01);
        text02 = findViewById(R.id.text02);
        Button btn01 = findViewById(R.id.btn01);
        Button btn02 = findViewById(R.id.btn02);
        Button btn03 = findViewById(R.id.btn03);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                launcher.launch(intent);
            }
        });
        
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text01.getText() == "") {
                    return;
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("text01", text01.getText().toString());
                intent.putExtra("text02", text02.getText().toString());
                launcher.launch(intent);
            }
        });

        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text01.setText("제목");
                text02.setText("내용");
            }
        });

        launcher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result->{
                    if(result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                        text01.setText(data.getStringExtra("edit01"));
                        text02.setText(data.getStringExtra("edit02"));
                    }
                });
    }

    public void OnClick(View view){
        RadioButton radioButton = (RadioButton) view;
        if(radioButton.getText().equals("1")){
            arr01[count] = (String)text01.getText();
            arr02[count] = (String)text02.getText();
            count = 0;
            text01.setText(arr01[0]);
            text02.setText(arr02[0]);
        }
        else if(radioButton.getText().equals("2")){
            arr01[count] = (String)text01.getText();
            arr02[count] = (String)text02.getText();
            count = 1;
            text01.setText(arr01[1]);
            text02.setText(arr02[1]);
        }
        else if(radioButton.getText().equals("3")){
            arr01[count] = (String)text01.getText();
            arr02[count] = (String)text02.getText();
            count = 2;
            text01.setText(arr01[2]);
            text02.setText(arr02[2]);
        }
        else if(radioButton.getText().equals("4")){
            arr01[count] = (String)text01.getText();
            arr02[count] = (String)text02.getText();
            count = 3;
            text01.setText(arr01[3]);
            text02.setText(arr02[3]);
        }
        else if(radioButton.getText().equals("5")){
            arr01[count] = (String)text01.getText();
            arr02[count] = (String)text02.getText();
            count = 4;
            text01.setText(arr01[4]);
            text02.setText(arr02[4]);
        }
    }
}