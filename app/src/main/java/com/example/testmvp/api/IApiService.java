package com.example.testmvp.api;



import com.example.testmvp.history.model.RepoHistory;
import com.example.testmvp.news.model.RepoNews;

import java.util.Map;


import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

public interface IApiService {

    @GET("/japi/toh")
    Observable<RepoHistory> searchHistory(@QueryMap Map<String,String> map);


    @GET("/toutiao/index")
    Observable<RepoNews> searchNew(@QueryMap Map<String,String> map);

}
