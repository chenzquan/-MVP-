package com.example.testmvp.news.model;

import com.example.testmvp.api.ApiUtils;
import com.example.testmvp.base.BaseModel;
import com.example.testmvp.base.IBasePresenter;
import com.example.testmvp.news.presenter.NewsPresenter;
import com.example.testmvp.news.view.INewsView;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class NewsModel extends BaseModel<NewsPresenter>{

    public NewsModel(NewsPresenter mPresenter) {
        super(mPresenter);
    }

    public void searchNews(String type){

        ApiUtils.searchNews(type)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Action1<RepoNews>() {
                    @Override
                    public void call(RepoNews repoNews) {
                        if(repoNews == null || repoNews.getResult() == null ||
                                repoNews.getResult().getData().size()<=0){
                            mPresenter.showEmpty();

                        }else{
                            mPresenter.showData(repoNews.getResult().getData());
                        }
                    }
                });
    }

}
