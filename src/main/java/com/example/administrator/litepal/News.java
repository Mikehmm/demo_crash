package com.example.administrator.litepal;

import org.litepal.crud.DataSupport;

import java.sql.Date;

/**
 * Created by Administrator on 2016/5/10.
 */
public class News extends DataSupport {

    private int id;

    private String title;

    private String content;

    private Date publishDate;

    private int commentCount;

    // 自动生成get、set方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
