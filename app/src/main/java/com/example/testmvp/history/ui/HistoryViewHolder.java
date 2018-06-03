package com.example.testmvp.history.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.testmvp.R;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HistoryViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_lunar)
    TextView tvLunar;

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @BindView(R.id.tv_content)
    TextView tvContent;


    public HistoryViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }



}
