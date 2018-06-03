package com.example.testmvp.history.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testmvp.R;
import com.example.testmvp.history.model.HistoryBean;

import java.util.ArrayList;
import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryViewHolder>{

    private Context context;


    private static List<HistoryBean> list;


    public HistoryAdapter(Context context,List<HistoryBean> list){
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(this.context).inflate(R.layout.holder_item_history,parent,false);

        return new HistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder holder, int position) {

        HistoryBean historyBean = list.get(position);
        holder.tvLunar.setText(historyBean.getLunar());
        holder.tvContent.setText(historyBean.getDes());
        holder.tvTitle.setText(historyBean.getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
