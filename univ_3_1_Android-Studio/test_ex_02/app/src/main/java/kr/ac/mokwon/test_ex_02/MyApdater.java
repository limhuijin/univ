package kr.ac.mokwon.test_ex_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyApdater extends RecyclerView.Adapter<MyApdater.ViewHolder> {
    String[] data1, data2;
    Context context;
    ItemClickListener listener;
    public interface ItemClickListener{
        void onItemClick(View view, int i);
    }

    public MyApdater(Context context, String[] data1, String[] data2){
        this.context = context;
        this.data1 = data1;
        this.data2 = data2;
    }

    public void setItemClickListener(ItemClickListener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setText(data1[position], data2[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        TextView text1, text2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.text01);
            text2 = itemView.findViewById(R.id.text02);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if(listener != null) {
                listener.onItemClick(view, getAdapterPosition());
            }
        }

        public void setText(String data1, String data2){
            text1.setText(data1);
            text2.setText(data2);
        }
    }
}
