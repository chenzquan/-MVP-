package com.example.testmvp.news.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.testmvp.R;
import com.example.testmvp.news.model.NewsBean;
import com.example.testmvp.news.model.RepoNews;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.ButterKnife;

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder>{

    private Context context;
    private List<NewsBean> list;

    public NewsAdapter(List<NewsBean> list){
        this.list = list;
    }

//    static class NewsViewHolder extends RecyclerView.ViewHolder{
//
//        TextView tvTitle;
//        TextView tvDate;
//        TextView tvCategory;
//
//        public NewsViewHolder(View itemView) {
//            super(itemView);
//            tvTitle = itemView.findViewById(R.id.tv_title);
//            tvDate = itemView.findViewById(R.id.tv_date);
//            tvCategory = itemView.findViewById(R.id.tv_category);
//        }
//    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(context==null){
            context = parent.getContext();
        }

        View view = LayoutInflater.from(context).inflate(R.layout.holder_item_news,parent,false);

        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        NewsBean newsBean = list.get(position);
      //  Log.i("sdfsdf",newsBean.getTitle());
        holder.tvTitle.setText(newsBean.getTitle());
        holder.tvDate.setText(newsBean.getDate());
        holder.tvCategory.setText(newsBean.getCategory());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
