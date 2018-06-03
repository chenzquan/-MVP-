package com.example.testmvp.history.view;

import com.example.testmvp.base.IBaseView;
import com.example.testmvp.history.model.HistoryBean;

import java.util.List;

public interface IHistoryView extends IBaseView{

    void showData(List<HistoryBean> list); //显示数据

    void showMessage(String msg);//显示信息

    void showEmpty();//显示是否为空

}
