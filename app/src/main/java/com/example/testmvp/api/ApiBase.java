package com.example.testmvp.api;


/*http://api.juheapi.com/japi/toh?key=您申请的KEY&v=1.0&month=11&day=1*/

import com.dou361.retrofit2.converter.fastjson.FastJsonConverterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ApiBase {

    protected static IApiService getService(){
        return getService(null);
    }



    protected static IApiService getService(String ip){
        return getService(ip,0,0);
    }


    protected static IApiService getService(String ip,long readTime,long connectTime){
        OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(readTime<=0 ? 30 : readTime, TimeUnit.SECONDS)
                .connectTimeout(connectTime<=0?30:connectTime,TimeUnit.SECONDS)
                .build();


        Retrofit retrofit = new Retrofit.Builder()
              //  .baseUrl(ip==null? "http://api.juheapi.com":ip)
                .baseUrl(ip==null ? "http://v.juhe.cn":ip)
                .client(client)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(FastJsonConverterFactory.create())
              //  .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(IApiService.class);
    }

}
