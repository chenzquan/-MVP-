package com.example.testmvp.base;

public abstract class BaseModel<SubP> {

    protected SubP mPresenter;

    public BaseModel(SubP mPresenter){
        this.mPresenter = mPresenter;
    }
}



