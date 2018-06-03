package com.example.testmvp.news.view;

import com.example.testmvp.base.IBaseView;
import com.example.testmvp.news.model.NewsBean;

import java.util.List;

public interface INewsView extends IBaseView{

    void showData(List<NewsBean> list);

    void showEmpty();

    void checkData(String msg);

}
