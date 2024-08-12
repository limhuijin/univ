package kr.ac.mokwon.ch08_recyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    String[] data1, data2;

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

        data1 = new String[20];
        data2 = new String[20];

        for(int i = 0; i < data1.length; i++){
            data1[i] = "Friend#" + i;
            data2[i] = "Item#" + i;
        }

        RecyclerView view = findViewById(R.id.recycler);
        view.setLayoutManager(new LinearLayoutManager(this));

        MyApdater adApdater = new MyApdater(this, data1, data2);
        adApdater.setItemClickListener(new MyApdater.ItemClickListener() {
            @Override
            public void onItemClick(View view, int i) {
                Toast.makeText(MainActivity.this, data1[i] + " " + data2[i], Toast.LENGTH_SHORT).show();
            }
        });

        view.setAdapter(adApdater);
    }
}