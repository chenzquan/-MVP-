package com.example.testmvp.base;

public interface IBaseDelegate<V extends IBaseView,P extends IBasePresenter<V>>{

    P createPresenter();  //初始化presenter
    //获取persenter
    P getPresenter();
}
