package com.zm.servicecontent.service;

import com.zm.servicecontent.bean.Content;
import com.zm.servicecontent.dao.ContentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentService {
    @Autowired(required = false)
    private ContentMapper contentMapper;

    /*

     */
    public Content findTextById(int newId){
        return contentMapper.findTextById(newId);
    }

    public Content findSimpleText(int newId){
        return contentMapper.findSimpleTextById(newId);
    }

    /*
    查看点赞upNews表的用户点赞数
     */
    public String findUpNews(int newId,int userId) {
        return contentMapper.findUpNews(newId,userId);
    }

    /*
    修改upNews表中的type的值
     */
    public int updateUpNews(int newId,int userId,String type){
        if(type.equals("-1")){
            contentMapper.updateReduceNews(newId);
        }else if(type.equals("1")){
            contentMapper.updateCreateNews(newId);
        }
        return contentMapper.updateUpNews(newId,userId,type);
    }

    /*
    upNews表中新插入一条
     */
    public int insertUpNews(int newId,int userId,String type){
        if(type.equals("-1")){
            contentMapper.updateReduceNews(newId);
        }else if(type.equals("1")){
            contentMapper.updateCreateNews(newId);
        }
        return contentMapper.insertUpNews(newId,userId,type);
    }
}
