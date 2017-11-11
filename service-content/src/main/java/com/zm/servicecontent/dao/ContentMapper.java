package com.zm.servicecontent.dao;

import com.zm.servicecontent.bean.Content;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ContentMapper {
    @Select("select news.newId ,title ,author ,date ,source, comments ,upNumber ,downNumber ,type ,content" +
            " from news,textContent where news.newId = #{newId} and textContent.newId = #{newId}")
    Content findTextById(@Param("newId") int newId);

    @Select("select news.newId ,title ,author, date ,source ,comments, upNumber ,downNumber ,type " +
            " from news where news.newId = #{newId}")
    Content findSimpleTextById(@Param("newId") int newId);

    @Select("select * from news  limit #{startId}, #{number}")
    @Results(value = {
            @Result(id = true,property = "newId",column = "newId"),
            @Result(property = "title",column = "title"),
            @Result(property = "author",column = "author"),
            @Result(property = "date",column = "date"),
            @Result(property = "source",column = "source"),
            @Result(property = "comments",column = "comments"),
            @Result(property = "upNumber",column = "upNumber"),
            @Result(property = "downNumber",column = "downNumber"),
            @Result(property = "type",column = "type"),
    })
    List<Content> paging(@Param("startId") int startId, @Param("number") int number);

    @Update("update news set upNumber = upNumber+1 where newId = #{newId}")
    int updateCreateNews(@Param("newId") int newId);

    @Update("update news set upNumber = upNumber-1 where newId = #{newId}")
    int updateReduceNews(@Param("newId") int newId);

    @Select("select type from upNews where newId = #{newId} and userId = #{userId}")
    String findUpNews(@Param("newId") int newId,@Param("userId") int userId);

    @Update("update upNews set type = #{type} where newId = #{newId} and userId = #{userId}")
    int updateUpNews(@Param("newId") int newId,@Param("userId") int userId,@Param("type") String type);

    @Insert("insert into upNews (newId,userId,type) values(#{newId},#{userId},#{type})")
    int insertUpNews(@Param("newId") int newId,@Param("userId") int userId,@Param("type") String type);
}
