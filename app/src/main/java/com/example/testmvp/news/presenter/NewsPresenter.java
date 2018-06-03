package com.example.testmvp.news.presenter;

import com.example.testmvp.base.IBasePresenter;
import com.example.testmvp.news.model.NewsBean;
import com.example.testmvp.news.model.NewsModel;
import com.example.testmvp.news.view.INewsView;

import java.util.List;

public class NewsPresenter implements IBasePresenter<INewsView>{

    private NewsModel newsModel;
    private INewsView iNewsView;

    public NewsPresenter(INewsView iNewsView){
        attachView(iNewsView);
        newsModel = new NewsModel(this);
    }


    @Override
    public void attachView(INewsView view) {
        this.iNewsView = view;
    }

    @Override
    public void detachView() {
        this.iNewsView = null;
    }

    public void showData(List<NewsBean> list){
        iNewsView.dismiss();
        iNewsView.showData(list);
    }


    public void showEmpty(){
        iNewsView.dismiss();
        iNewsView.showEmpty();
    }


    public void checkData(String msg){
        iNewsView.checkData(msg);
    }

    public void searchNews(String type){
        iNewsView.showLoading();
        newsModel.searchNews(type);
    }

}
