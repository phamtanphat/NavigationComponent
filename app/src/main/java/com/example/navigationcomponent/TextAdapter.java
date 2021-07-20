package com.example.navigationcomponent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TextAdapter extends RecyclerView.Adapter<TextAdapter.TextViewHolder> {


    List<String> mList;

    public TextAdapter(List<String> mList) {
        this.mList = mList;
    }

    @NonNull
    @Override
    public TextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TextViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent
                , false));
    }

    @Override
    public void onBindViewHolder(@NonNull TextViewHolder holder, int position) {
        String s = mList.get(position);
        holder.txtDemo.setText(s);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class TextViewHolder extends RecyclerView.ViewHolder {

        TextView txtDemo;

        public TextViewHolder(@NonNull View itemView) {
            super(itemView);
            txtDemo = itemView.findViewById(R.id.textViewDemo);
        }
    }
}
