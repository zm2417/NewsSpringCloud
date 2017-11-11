package com.zm.servicecontent.dao;

import com.zm.servicecontent.bean.RelateNews;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RelateNewsMapper {
    @Select("select lessNewsId,lessNewsNumber,title from relateNews,news where hostNewsId = #{newsId} and lessNewsId = newId")
    @Results(value = {
            @Result(property = "title",column = "title"),
            @Result(property = "lessNewsId",column = "lessNewsId"),
            @Result(property = "lessNewsNumber",column = "lessNewsNumber"),
    })
    List<RelateNews> getRelateNews(@Param("newsId") int newsId);
}
