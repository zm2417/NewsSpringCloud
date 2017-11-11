package com.zm.servicecontent.dao;

import com.zm.servicecontent.bean.Tags;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TagMapper {
    @Select("select * from tags where newId = #{newId}")
    @Results(value = {
            @Result(id = true,property = "tagId",column = "tagId"),
            @Result(property = "newId",column = "newId"),
            @Result(property = "tag",column = "tag"),
    })
    List<Tags> getTags(@Param("newId") int newId);
}
