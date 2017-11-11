package com.zm.servicecomment.service;

import com.zm.servicecomment.bean.Comment;
import com.zm.servicecomment.dao.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CommentService {
    @Autowired(required = false)
    private CommentMapper commentMapper;

    /*
    获取分页的评论条数，按时间排序。
     */
    public List<Comment> getComment(int newId,int start,int pagingNumber){
        return commentMapper.getComments(newId,start,pagingNumber);
    }

    /*
    插入新评论。
     */
    public int insert(int newId, int userId, String content, Date date){
        return commentMapper.insert(newId,userId,content,date);
    }

    /*
    增加评论点赞数
     */
    public int updateCreateUpNumber(int commentId){
        return commentMapper.updateCreateUpNumber(commentId);
    }

    /*
    减少评论点赞数
     */
    public int updateReduceUpNumber(int commentId){
        return commentMapper.updateReduceUpNumber(commentId);
    }
}
