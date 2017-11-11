package com.zm.servicecomment.bean;

import java.util.Date;

public class Reply {
    private int rId;
    private int commentId;
    private int userId;
    private String username;
    private String headImage;
    private String content;
    private Date date;
    private int upNumber;
    private int replyUserId;
    private String name;

    @Override
    public String toString() {
        return "Reply{" +
                "rId=" + rId +
                ", commentId=" + commentId +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", headImage='" + headImage + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", upNumber=" + upNumber +
                ", replyUserId=" + replyUserId +
                ", name='" + name + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(int replyUserId) {
        this.replyUserId = replyUserId;
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

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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
}
