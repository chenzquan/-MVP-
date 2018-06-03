package com.example.testmvp.history.presenter;

import com.example.testmvp.base.IBasePresenter;
import com.example.testmvp.history.model.HistoryBean;
import com.example.testmvp.history.model.HistoryModel;
import com.example.testmvp.history.view.IHistoryView;

import java.util.List;

public class HistoryPresenter implements IBasePresenter<IHistoryView> {

    private IHistoryView mView;

    private HistoryModel mModel;


    public HistoryPresenter(IHistoryView view){
        attachView(view);
        mModel = new HistoryModel(this);
    }


    @Override
    public void attachView(IHistoryView view) { //绑定接口
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }

    public void showData(List<HistoryBean> list){
        mView.dismiss();
        mView.showData(list);
    }


    public void showEmpty(){
        mView.dismiss();
        mView.showEmpty();
    }


    public void showMessage(String msg){
        mView.showMessage(msg);
    }


    public void searchHistory(String month,String day){
        mView.showLoading();
        mModel.searchHistory(month,day);
    }


}
