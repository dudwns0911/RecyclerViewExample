package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<String> mTextData = null;


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView =itemView.findViewById(R.id.tv_item);
        }
    }

    MyAdapter(ArrayList<String> textList){
        mTextData = textList;
    }
    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.recyclerview_item, parent, false) ;
        MyAdapter.ViewHolder vh = new MyAdapter.ViewHolder(view) ;
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        String text = mTextData.get(position);
        holder.textView.setText(text);
    }

    @Override
    public int getItemCount() {
        return mTextData.size();
    }
}
