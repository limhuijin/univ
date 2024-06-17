package kr.ac.mokwon.ch08_customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter<String> {
    Activity _activity;
    String[] _obj1, _obj2;
    Integer[] _imgs;
    public MyAdapter(Activity context, String[] objects, String[] objects2, Integer[] imgs) {
        super(context, R.layout.my_list, objects);
        _activity = context;
        _obj1 = objects;
        _obj2 = objects2;
        _imgs = imgs;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = _activity.getLayoutInflater().inflate(R.layout.my_list, null, true);
        ImageView img = rowView.findViewById(R.id.img);
        TextView text1 = rowView.findViewById(R.id.text01);
        TextView text2 = rowView.findViewById(R.id.text02);

        img.setImageResource(_imgs[position]);
        text1.setText(_obj1[position]);
        text2.setText(_obj2[position]);

        return rowView;
    }
}
