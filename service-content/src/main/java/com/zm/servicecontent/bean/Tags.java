package com.zm.servicecontent.bean;

public class Tags {
    private int tagId;
    private int newId;
    private String tag;

    @Override
    public String toString() {
        return "Tags{" +
                "tagId=" + tagId +
                ", newId=" + newId +
                ", tag='" + tag + '\'' +
                '}';
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
