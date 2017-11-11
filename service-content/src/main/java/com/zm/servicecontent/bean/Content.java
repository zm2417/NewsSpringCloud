package com.zm.servicecontent.bean;

public class Content {
    private int newId;
    private String title;
    private String author;
    private String date;
    private String source;
    private int comments;
    private int upNumber;
    private int downNumber;
    private String type;
    private String content;
    private String upNewsType;

    public String getUpNewsType() {
        return upNewsType;
    }

    public void setUpNewsType(String upNewsType) {
        this.upNewsType = upNewsType;
    }

    @Override
    public String toString() {
        return "Content{" +
                "newId=" + newId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                ", source='" + source + '\'' +
                ", comments=" + comments +
                ", upNumber=" + upNumber +
                ", downNumber=" + downNumber +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getUpNumber() {
        return upNumber;
    }

    public void setUpNumber(int upNumber) {
        this.upNumber = upNumber;
    }

    public int getDownNumber() {
        return downNumber;
    }

    public void setDownNumber(int downNumber) {
        this.downNumber = downNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
