package kr.ac.mokwon.ch08_ex;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter<String> {
    Activity _activity;
    Activity _activity2;
    String[] _obj1;
    String[] _obj2;
    CheckBox checkBox1;
    public MyAdapter(Activity context, String[] objects, String[] objects2) {
        super(context, R.layout.my_list, objects);
        _activity = context;
        //_activity2 = context2;
        _obj1 = objects;
        _obj2 = objects2;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = _activity.getLayoutInflater().inflate(R.layout.my_list, null, true);
        TextView text1 = rowView.findViewById(R.id.text01);
        TextView text2 = rowView.findViewById(R.id.text02);
        text1.setText(_obj1[position]);
        text2.setText(_obj2[position]);

        checkBox1 = rowView.findViewById(R.id.check01);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox box = (CheckBox) view;
                Toast.makeText(_activity, box.getText() + " " + box.isChecked(), Toast.LENGTH_SHORT).show();
            }
        });

        return rowView;
    }
}