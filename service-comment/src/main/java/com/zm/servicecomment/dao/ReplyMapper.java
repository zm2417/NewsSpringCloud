package com.zm.servicecomment.dao;

import com.zm.servicecomment.bean.Reply;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;

@Mapper
public interface ReplyMapper {

    /*
    回复comment中的评论。
     */
    @Insert("insert into reply (commentId,userId,content,date) values (#{commentId},#{userId}" +
            ",#{content},#{date})")
    int insert(@Param("commentId") int commentId, @Param("userId") int userId,
               @Param("content") String content, @Param("date")Date date);

    /*
    评论【点击查看对话】的评论。
     */
    @Insert("insert into reply(commentId,userId,content,date,replyUserId) values(" +
            "#{commentId},#{userId},#{content},#{date},#{replyUserId})")
    int insertReply(@Param("commentId") int commentId, @Param("userId") int userId,
                    @Param("content") String content, @Param("date")Date date,
                    @Param("replyUserId") int replyUserId);


    @Select("select reply.*,user.name,user.headImage from reply,user " +
            "where commentId = #{commentId} and user.userId = reply.userId")
    @Results({
            @Result(id=true,property = "rId",column = "rId"),
            @Result(property = "commentId",column = "commentId"),
            @Result(property = "userId",column = "userId"),
            @Result(property = "username",column = "name"),
            @Result(property = "headImage",column = "headImage"),
            @Result(property = "content",column = "content"),
            @Result(property = "date",column = "date"),
            @Result(property = "upNumber",column = "upNumber"),
            @Result(property = "replyUserId",column = "replyUserId")
    })
    List<Reply> getReply(@Param("commentId") int commentId);

    @Update("update reply set upNumber = upNumber +1 where rId = #{rId}")
    int updateCreateUpNumber(@Param("rId") int rId);

    @Update("update reply set upNumber = upNumber -1 where rId = #{rId}")
    int updateReduceUpNumber(@Param("rId") int rId);
}
