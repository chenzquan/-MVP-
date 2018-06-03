package com.example.testmvp.history.model;


import java.util.List;

/**
 * result : [{"_id":"11201101","title":"北宋江南方腊起义","pic":"http://juheimg.oss-cn-hangzhou
 * .aliyuncs.com/toh/201109/18/7D2278978.jpg","year":1120,"month":11,"day":1,
 * "des":"在897年前的今天，1120年11月1日 (农历十月初九)，北宋江南方腊起义。","lunar":"庚子年十月初九"}]
 * reason : 请求成功！
 * error_code : 0
 */



public class RepoHistory {

    private String reason;

    private int error_code;

    private List<HistoryBean> result;


    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<HistoryBean> getResult() {
        return result;
    }

    public void setResult(List<HistoryBean> result) {
        this.result = result;
    }
}
