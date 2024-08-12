package kr.ac.mokwon.ch08_customlistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Integer[] imgs = {R.drawable.neko, R.drawable.neko, R.drawable.neko, R.drawable.neko, R.drawable.neko, R.drawable.neko, R.drawable.neko, R.drawable.neko, R.drawable.neko, R.drawable.neko};
    String[] data1 = {"동물1", "동물2", "동물3", "동물4", "동물5", "동물6", "동물7", "동물8", "동물9", "동물10"};
    String[] data2 = {"귀여워1", "귀여워2", "귀여워3", "귀여워4", "귀여워5", "귀여워6", "귀여워7", "귀여워8", "귀여워9", "귀여워10"};
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

        MyAdapter adatper = new MyAdapter(MainActivity.this, data1, data2, imgs);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adatper);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, data1[i] + data2[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}