package com.example.testmvp.history.model;


/**
 * _id : 19841101m1
 * title : 我国与阿联酋建立外交关系
 * pic :
 * year : 1984
 * month : 11
 * day : 1
 * des : 1984年11月1日 (农历十月初九)，我国与阿联酋建立外交关系。
 * lunar : 甲子年十月初九
 */

/**
 * result : [{"_id":"11201101","title":"北宋江南方腊起义","pic":"http://juheimg.oss-cn-hangzhou
 * .aliyuncs.com/toh/201109/18/7D2278978.jpg","year":1120,"month":11,"day":1,
 * "des":"在897年前的今天，1120年11月1日 (农历十月初九)，北宋江南方腊起义。","lunar":"庚子年十月初九"}]
 * reason : 请求成功！
 * error_code : 0
 */

public class HistoryBean {

    private String _id;
    private String title;
    private String pic;
    private int year;
    private int month;
    private int day;
    private String des;
    private String lunar;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getLunar() {
        return lunar;
    }

    public void setLunar(String lunar) {
        this.lunar = lunar;
    }
}
