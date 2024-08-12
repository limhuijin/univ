package kr.ac.mokwon.ch07_ex;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Map<String, String> users = new HashMap<String, String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText idText = findViewById(R.id.id);
        EditText passText = findViewById(R.id.ps);
        EditText text = findViewById(R.id.text);
        Button logBtn = findViewById(R.id.btn11);
        Button signBtn = findViewById(R.id.btn12);

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(users.containsKey(idText.getText().toString())) {
                    if(users.get(idText.getText().toString()).equals(passText.getText().toString())){
                        text.setText(idText.getText().toString() + "님 환영합니다.");
                    }
                }
                else{
                    text.setText("없는 정보입니다.");
                }
            }
        });


        signBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.signup);

                dialog.setTitle("login");
                final EditText idText = dialog.findViewById(R.id.username);
                final EditText passText = dialog.findViewById(R.id.password);
                Button OKBtn = dialog.findViewById(R.id.btn01);
                Button CencelBtn = dialog.findViewById(R.id.btn02);

                OKBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(users.containsKey(idText.getText().toString())){
                            return;
                        }
                        users.put(idText.getText().toString(), passText.getText().toString());
                        dialog.dismiss();
                        text.setText(idText.getText().toString() + "님 가입 성공.");
                    }
                });

                CencelBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }
}