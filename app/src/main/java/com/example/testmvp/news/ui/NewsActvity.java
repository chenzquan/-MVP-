package com.example.testmvp.news.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.testmvp.R;
import com.example.testmvp.base.BaseMVPActivity;
import com.example.testmvp.news.model.NewsBean;
import com.example.testmvp.news.presenter.NewsPresenter;
import com.example.testmvp.news.ui.adapter.NewsAdapter;
import com.example.testmvp.news.view.INewsView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewsActvity extends BaseMVPActivity<INewsView,NewsPresenter>
        implements INewsView{

    @BindView(R.id.et_type)
    EditText etType;

    @BindView(R.id.btn_search)
    Button btnSearch;

    @BindView(R.id.rlv_news)
    RecyclerView rlvNews;

    @BindView(R.id.ll_empty)
    LinearLayout llEmpty;

    @BindView(R.id.ll_loading)
    LinearLayout llLoading;

    private NewsAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_actvitity);

        ButterKnife.bind(this);
    }

    @Override
    public NewsPresenter createPresenter() {
        return new NewsPresenter(this);
    }


    @Override
    public void showData(List<NewsBean> list) {  //from INewsView
        llEmpty.setVisibility(View.GONE);
        rlvNews.setLayoutManager(new LinearLayoutManager(this));
        rlvNews.setHasFixedSize(true);
        rlvNews.setItemAnimator(new DefaultItemAnimator());

        adapter = new NewsAdapter(list);
        rlvNews.setAdapter(adapter);

    }

    @Override
    public void showEmpty() { // from INewsView
        llEmpty.setVisibility(View.VISIBLE);
    }

    @Override
    public void checkData(String msg) { // from INewsView
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading() {
        llLoading.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismiss() {
        llLoading.setVisibility(View.GONE);
    }

    @OnClick(R.id.btn_search)
    public void search(View view){
        getPresenter().searchNews(etType.getText().toString());
    }

}
