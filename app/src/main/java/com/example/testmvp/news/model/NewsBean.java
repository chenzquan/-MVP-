package com.example.testmvp.news.model;


//
//	"reason":"成功的返回",
//            "result":{
//            "stat":"1",
//            "data":[
//            {
//            "uniquekey":"3f3cdb02efe2127c91faccc76de10541",
//            "title":"帕金斯训练时细心观察詹姆斯眼睛伤势，发现仍充满血丝：莫名心疼",
//            "date":"2018-06-03 16:03",
//            "category":"头条",
//            "author_name":"最具争议的篮球资讯",
//            "url":"http:\/\/mini.eastday.com\/mobile\/180603160338604.html",
//            "thumbnail_pic_s":"http:\/\/01.imgmini.eastday.com\/mobile\/20180603\/20180603_289407906bca1ab9872490e8bd0d1a62_cover_mwpm_03200403.jpg",
//            "thumbnail_pic_s02":"http:\/\/01.imgmini.eastday.com\/mobile\/20180603\/20180603_10102fc63673231c0d172b85bb0b76fa_cover_mwpm_03200403.jpg",
//            "thumbnail_pic_s03":"http:\/\/01.imgmini.eastday.com\/mobile\/20180603\/20180603_8bbf132a5097a04f7a5a3a976aac066f_cover_mwpm_03200403.jpg"
//            },
//            {
public class NewsBean {


    private String uniquekey;

    private String title;

    private String date;

    private String category;

    private String author_name;

    private String url;

    private String thumbnail_pic_s;

    private String thumbnail_pic_s02;
    private String thumbnail_pic_s03;

    public String getUniquekey() {
        return uniquekey;
    }

    public void setUniquekey(String uniquekey) {
        this.uniquekey = uniquekey;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnail_pic_s() {
        return thumbnail_pic_s;
    }

    public void setThumbnail_pic_s(String thumbnail_pic_s) {
        this.thumbnail_pic_s = thumbnail_pic_s;
    }

    public String getThumbnail_pic_s02() {
        return thumbnail_pic_s02;
    }

    public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
        this.thumbnail_pic_s02 = thumbnail_pic_s02;
    }

    public String getThumbnail_pic_s03() {
        return thumbnail_pic_s03;
    }

    public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
        this.thumbnail_pic_s03 = thumbnail_pic_s03;
    }
}
