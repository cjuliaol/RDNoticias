package com.example.thewizard.cjuliaol.rdnoticias;

import java.util.Date;

/**
 * Created by cjuliaol on 13-Dec-15.
 */
public class News {

    private int newsId;
    private String title;
    private String newsText;
    private String newsType;
    private Date factDate;
    private String agency;
    private int journalistId;

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Date getFactDate() {
        return factDate;
    }

    public void setFactDate(Date factDate) {
        this.factDate = factDate;
    }

    public int getJournalistId() {
        return journalistId;
    }

    public void setJournalistId(int journalistId) {
        this.journalistId = journalistId;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
