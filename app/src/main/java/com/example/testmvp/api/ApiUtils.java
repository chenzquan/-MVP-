package com.example.testmvp.api;

import com.example.testmvp.history.model.RepoHistory;
import com.example.testmvp.news.model.RepoNews;

import java.util.HashMap;
import java.util.Map;

import rx.Observable;


public class ApiUtils extends ApiBase{

    public static Observable<RepoHistory> searchHistory(String month, String day){
        Map<String,String> map = new HashMap<>();

        map.put("key","7ac7e02ff7f1f8f1ccdc2f9e5dddb6be");
        map.put("v","1.0");
        map.put("month",month);
        map.put("day",day);

        return getService().searchHistory(map);

    }



    public static Observable<RepoNews> searchNews(String type){
        Map<String,String> map = new HashMap<>();

        map.put("type",type);
        map.put("key","6be6d6fbfabd3ea4e9475c0c68a63928");

        return getService().searchNew(map);
    }



}
