package com.example.testmvp.base;

public interface IBasePresenter<V extends IBaseView>{ //交互中间人的接口

    void attachView(V view); //绑定接口

    void detachView();//释放接口
}
