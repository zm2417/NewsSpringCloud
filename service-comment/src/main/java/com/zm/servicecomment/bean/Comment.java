package com.zm.servicecomment.bean;

import java.util.Date;

public class Comment {
    private int commentId;
    private int newId;
    private int userId;
    private String name;
    private String headImage;
    private String content;
    private Date date;
    private int upNumber;
    private boolean hasReply;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", newId=" + newId +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", headImage='" + headImage + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", upNumber=" + upNumber +
                ", hasReply=" + hasReply +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUpNumber() {
        return upNumber;
    }

    public void setUpNumber(int upNumber) {
        this.upNumber = upNumber;
    }

    public boolean isHasReply() {
        return hasReply;
    }

    public void setHasReply(boolean hasReply) {
        this.hasReply = hasReply;
    }
}
