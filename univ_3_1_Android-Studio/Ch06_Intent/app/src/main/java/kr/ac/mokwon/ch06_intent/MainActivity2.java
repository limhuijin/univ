package kr.ac.mokwon.ch06_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        TextView text01 = findViewById(R.id.id);
        text01.setText(intent.getStringExtra("id"));

        TextView text02 = findViewById(R.id.pass);
        text02.setText(intent.getStringExtra("pass"));

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("txt", "로그인 완료");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}