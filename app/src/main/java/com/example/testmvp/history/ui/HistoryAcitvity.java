package com.example.testmvp.history.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.testmvp.R;
import com.example.testmvp.base.BaseMVPActivity;
import com.example.testmvp.base.IBasePresenter;
import com.example.testmvp.history.model.HistoryBean;
import com.example.testmvp.history.presenter.HistoryPresenter;
import com.example.testmvp.history.view.IHistoryView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HistoryAcitvity extends BaseMVPActivity<IHistoryView,HistoryPresenter>
        implements IHistoryView {




    @BindView(R.id.et_month)
    EditText etMonth;

    @BindView(R.id.et_day)
    EditText etDay;

    @BindView(R.id.rlv_history)
    RecyclerView rlvHistory;

    @BindView(R.id.ll_empty)
    LinearLayout llEmpty;

    @BindView(R.id.ll_loading)
    LinearLayout llLoading;

    private HistoryAdapter adapter;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_activity);
        ButterKnife.bind(this);
    }

    @Override
    public HistoryPresenter createPresenter() {
        return new HistoryPresenter(this);
    }

    @Override
    public void showData(List<HistoryBean> list) { // from historyView
        llEmpty.setVisibility(View.GONE);

        rlvHistory.setLayoutManager(new LinearLayoutManager(this));

        rlvHistory.setHasFixedSize(true);

        rlvHistory.setItemAnimator(new DefaultItemAnimator());

        adapter = new HistoryAdapter(this,list);

        rlvHistory.setAdapter(adapter);

    }

    @Override
    public void showMessage(String msg) {  // from historyView
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showEmpty() {  //from historyView
        rlvHistory.setVisibility(View.VISIBLE);
    }

    @Override
    public void showLoading() { //from BaseView
        llLoading.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismiss() {  //from BaseView
        llLoading.setVisibility(View.GONE);
    }


    @OnClick(R.id.btn_search)
    public void submit(View view){


        getPresenter().searchHistory(etMonth.getText().toString(),etDay.getText().toString());
    }

}
