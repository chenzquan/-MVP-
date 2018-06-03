package com.example.testmvp.news.model;

import java.util.List;

public class ResultBean {
    private List<NewsBean> data;

    private int stat;
    public List<NewsBean> getData() {
        return data;
    }

    public void setData(List<NewsBean> data) {
        this.data = data;
    }


    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }
}
