package kr.ac.mokwon.ch03_03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText _idText, _pwText;
        TextView _text;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _idText = findViewById(R.id.edit01);
        _pwText = findViewById(R.id.edit02);
        _text = findViewById(R.id.txt01);

        Button btn = findViewById(R.id.btn01);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _text.setText("아이디 : " + _idText.getText() + "\n패스워드 : " + _pwText.getText());
            }
        });

    }
}