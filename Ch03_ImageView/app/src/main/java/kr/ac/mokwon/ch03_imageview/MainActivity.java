package kr.ac.mokwon.ch03_imageview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.img);
        Button scale = findViewById(R.id.scale);
        Button rotation = findViewById(R.id.rotation);
        Button alpha = findViewById(R.id.alpha);

        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView.ScaleType[] scaleTypes = {
                        ImageView.ScaleType.CENTER,
                        ImageView.ScaleType.CENTER_CROP,
                        ImageView.ScaleType.CENTER_INSIDE,
                        ImageView.ScaleType.FIT_CENTER,
                        ImageView.ScaleType.FIT_XY,
                };

                img.setScaleType(scaleTypes[index++]);

                if (index > scaleTypes.length - 1){
                    index = 0;
                }
            }
        });

        rotation.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               img.setRotation(img.getRotation() + 45);
           }
        });

        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float alp = img.getAlpha();
                img.setAlpha(alp == 1 ? 0.5f : 1);
            }
        });

        ImageButton minusBtn = findViewById(R.id.img_btn01);
        ImageButton plusBtn = findViewById(R.id.img_btn02);

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.home);
            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.gunchim);
            }
        });
    }
}