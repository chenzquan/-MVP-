package com.example.testmvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract class BaseMVPActivity<V extends IBaseView,P extends IBasePresenter<V>>
        extends BaseActvity implements IBaseDelegate<V,P>{

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mPresenter = createPresenter();
    }


    @Override
    public P getPresenter() {
        return this.mPresenter;
    }


    @Override
    protected void onDestroy() {
        mPresenter.detachView();
        super.onDestroy();
    }
}
