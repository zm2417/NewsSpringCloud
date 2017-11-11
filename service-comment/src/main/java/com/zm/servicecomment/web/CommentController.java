package com.zm.servicecomment.web;

import com.zm.servicecomment.bean.Comment;
import com.zm.servicecomment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/getComments")
    public List<Comment> getComments(int newId,int start,int pagingNumber){
        return commentService.getComment(newId,start,pagingNumber);
    }

    //int newId, int userId, String content, Date date
    @PostMapping("/addComment")
    public int addComment(Comment comment){
        return commentService.insert(comment.getNewId(),comment.getUserId(),comment.getContent(),comment.getDate());
    }

    @PostMapping("/create")
    public int updateCreateUpNumber(int commentId){
        return commentService.updateCreateUpNumber(commentId);
    }

    @PostMapping("/reduce")
    public int updateReduceUpNumber(int commentId){
        return commentService.updateReduceUpNumber(commentId);
    }
}
