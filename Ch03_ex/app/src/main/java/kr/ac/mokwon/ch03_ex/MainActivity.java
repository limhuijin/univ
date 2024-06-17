package kr.ac.mokwon.ch03_ex;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String str = "";
    String str1 = "";
    float str2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView _text01, _text02;
        Button[] btn = new Button[15];
        Integer[] btn_id = {R.id.btn00, R.id.btn01, R.id.btn02, R.id.btn03, R.id.btn04,
                R.id.btn05, R.id.btn06, R.id.btn07, R.id.btn08, R.id.btn09,
                R.id.btn_add, R.id.btn_sub, R.id.btn_mul, R.id.btn_div, R.id.btn_sum};


        for(int i = 0; i < 15; i++){
            btn[i] = findViewById(btn_id[i]);
        }

        _text01 = findViewById(R.id.textView01);
        _text02 = findViewById(R.id.textView02);

        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("fff","ffff");
                str += "0";
                _text01.setText("1111");
            }
        });

        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += "1";
                _text01.setText(str);
            }
        });

        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += "2";
                _text01.setText(str);
            }
        });

        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += "3";
                _text01.setText(str);
            }
        });

        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += "4";
                _text01.setText(str);
            }
        });

        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += "5";
                _text01.setText(str);
            }
        });

        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += "6";
                _text01.setText(str);
            }
        });

        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += "7";
                _text01.setText(str);
            }
        });

        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += "8";
                _text01.setText(str);
            }
        });

        btn[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += "9";
                _text01.setText(str);
            }
        });

        btn[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str;
                str = "";
                str2 = 1;
                _text01.setText(str);
                _text02.setText(str1);
            }
        });

        btn[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str;
                str = "";
                str2 = 2;
                _text01.setText(str);
                _text02.setText(str1);
            }
        });

        btn[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str;
                str = "";
                str2 = 3;
                _text01.setText(str);
                _text02.setText(str1);
            }
        });

        btn[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str;
                str = "";
                str2 = 4;
                _text01.setText(str);
                _text02.setText(str1);
            }
        });

        btn[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str2 == 1){
                    str = Integer.toString(Integer.parseInt(str1) + Integer.parseInt(str));
                }else if(str2 == 2) {
                    str = Integer.toString(Integer.parseInt(str1) - Integer.parseInt(str));
                }else if(str2 == 3) {
                    str = Integer.toString(Integer.parseInt(str1) * Integer.parseInt(str));
                }else if(str2 == 4) {
                    str = Integer.toString(Integer.parseInt(str1) / Integer.parseInt(str));
                }
                _text01.setText(str);
                _text02.setText("");
                str1 = "";
                str2 = 0;
            }
        });
    }
}