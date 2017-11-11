package com.zm.servicecomment.dao;

import com.zm.servicecomment.bean.Comment;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface CommentMapper {

    @Select("select comment.*,user.name,user.headImage from comment,user " +
            "where newId = #{newId} and comment.userId = user.userId order " +
            "by cast(date as datetime) desc limit #{start} , #{pagingNumber} ")
    @Results({
            @Result(id = true,property = "commentId",column = "commentId"),
            @Result(property = "newId",column = "newId"),
            @Result(property = "userId",column = "userId"),
            @Result(property = "name",column = "name"),
            @Result(property = "headImage",column = "headImage"),
            @Result(property = "content",column = "content"),
            @Result(property = "date",column = "date"),
            @Result(property = "upNumber",column = "upNumber"),
            @Result(property = "hasReply",column = "hasReply"),
    })
    List<Comment> getComments(@Param("newId") int newId,
                              @Param("start") int start,@Param("pagingNumber") int pagingNumber);

    @Insert("insert into comment (newId,userId,content,date,upNumber,hasReply) " +
            "values(#{newId},#{userId},#{content},#{date},"+0+","+false+")")
    int insert(@Param("newId") int newId,@Param("userId") int userId,
               @Param("content") String content,@Param("date") Date date);

    @Update("update comment set hasReply = 1 where commentId = #{commentId}")
    int updateHasReply(@Param("commentId") int commentId);

    @Update("update comment set upNumber = upNumber+1 where commentId = #{commentId}")
    int updateCreateUpNumber(@Param("commentId") int commentId);

    @Update("update comment set upNumber = upNumber-1 where commentId = #{commentId}")
    int updateReduceUpNumber(@Param("commentId") int commentId);
}
