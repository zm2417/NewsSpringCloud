package com.zm.servicecontent.bean;

public class RelateNews {
    private int rnId;
    private int hostNewsId;
    private int lessNewsId;
    private String title;
    private int lessNewsNumber;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "RelateNews{" +
                "rnId=" + rnId +
                ", hostNewsId=" + hostNewsId +
                ", lessNewsId=" + lessNewsId +
                ", lessNewsNumber=" + lessNewsNumber +
                '}';
    }

    public int getRnId() {
        return rnId;
    }

    public void setRnId(int rnId) {
        this.rnId = rnId;
    }

    public int getHostNewsId() {
        return hostNewsId;
    }

    public void setHostNewsId(int hostNewsId) {
        this.hostNewsId = hostNewsId;
    }

    public int getLessNewsId() {
        return lessNewsId;
    }

    public void setLessNewsId(int lessNewsId) {
        this.lessNewsId = lessNewsId;
    }

    public int getLessNewsNumber() {
        return lessNewsNumber;
    }

    public void setLessNewsNumber(int lessNewsNumber) {
        this.lessNewsNumber = lessNewsNumber;
    }
}
