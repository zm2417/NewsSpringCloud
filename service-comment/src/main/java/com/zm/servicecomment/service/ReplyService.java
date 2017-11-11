package com.zm.servicecomment.service;

import com.zm.servicecomment.bean.Reply;
import com.zm.servicecomment.bean.User;
import com.zm.servicecomment.dao.CommentMapper;
import com.zm.servicecomment.dao.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReplyService {
    @Autowired(required = false)
    private ReplyMapper replyMapper;
    @Autowired(required = false)
    private CommentMapper commentMapper;
    @Autowired
    private UserFeignService userFeignService;

    /*
    insert reply.and update comment table's hasReply.
    no replyUserId.
     */
    public int insert(int commentId, int userId,String content, Date date){
        commentMapper.updateHasReply(commentId);
        return replyMapper.insert(commentId,userId,content,date);
    }

    /*
    get all reply.
     */
    public List<Reply> getReply(int commentId){
        List<Reply> replyList = replyMapper.getReply(commentId);
        for (Reply reply:replyList){
            if(reply.getReplyUserId() != 0){
                User user = userFeignService.findUserById(reply.getReplyUserId());
                reply.setName(user.getName());
            }
        }
        return replyList;
    }

    /*
    have replyUserId.
     */
    public int insertWithReply(int commentId, int userId,String content, Date date,int replyUserId){
        return replyMapper.insertReply(commentId,userId,content,date,replyUserId);
    }

    /*
    create upNumber.
     */
    public int updateCreate(int rId){
        return replyMapper.updateCreateUpNumber(rId);
    }

    /*
    reduce upNumber
     */
    public int updateReduce(int rId){
        return replyMapper.updateReduceUpNumber(rId);
    }
}
