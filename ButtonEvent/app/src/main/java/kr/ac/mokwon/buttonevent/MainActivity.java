package kr.ac.mokwon.buttonevent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button button01 = findViewById(R.id.btn01);
        Button button02 = findViewById(R.id.btn02);


        //방법 1
        button01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Button btn01 = (Button)view;
                Log.i("mokwon", "1번 버튼 클릭");
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Button btn02 = (Button)view;
                Log.i("mokwon", "2번 버튼 클릭");
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //방법 3
    public void Button_Act1(View view){
        Log.i("mokwon", "2번 버튼 클릭");
    }


    /* 방법 1 / 클래스 생성 방식
    public class ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Button btn01 = (Button)view;
            Log.i("mokwon", "button click -> " + btn01.getText());
        }
    }*/
}