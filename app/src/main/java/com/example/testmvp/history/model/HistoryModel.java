package com.example.testmvp.history.model;

import android.text.TextUtils;

import com.example.testmvp.api.ApiUtils;
import com.example.testmvp.base.BaseModel;
import com.example.testmvp.history.presenter.HistoryPresenter;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;


public class HistoryModel extends BaseModel<HistoryPresenter> {

    public HistoryModel(HistoryPresenter mPresenter) {
        super(mPresenter);
    }

    public void searchHistory(String month,String day){

        if(TextUtils.isEmpty(month)){
            mPresenter.showMessage("月份不能为空");
            return;
        }


        int iMonth = Integer.valueOf(month).intValue();


        if(iMonth<=0 || iMonth>12){
            mPresenter.showMessage("只能输入1-12的月份");
            return;
        }

        if(TextUtils.isEmpty(day)){
            mPresenter.showMessage("天不能为空");
            return;
        }

        int iday = Integer.valueOf(day).intValue();

        if(iday<=0 || iday>31){
            mPresenter.showMessage("只能输入1-31天");
            return;
        }


        ApiUtils.searchHistory(month, day)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Action1<RepoHistory>() {
                    @Override
                    public void call(RepoHistory repoHistory) {
                        if (repoHistory == null || repoHistory.getResult() == null || repoHistory.getResult().size() <= 0) {
                            mPresenter.showEmpty();
                        } else {
                            mPresenter.showData(repoHistory.getResult());
                        }
                    }
                });


    }


}
