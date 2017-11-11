package com.zm.servicelogin.dao;

import com.zm.servicelogin.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where name = #{name} and pwd = #{pwd}")
    User findUser(@Param("name") String name,@Param("pwd") String pwd);

    @Insert("insert into user(name,pwd,email) values(#{name},#{pwd},#{email})")
    int add (@Param("name") String name,@Param("pwd") String pwd,@Param("email") String email);

    @Select("select * from user where userId = #{userId}")
    User findUserById(@Param("userId") int userId);

    @Update("update user set role = #{role} where userId = #{userId}")
    int changeRole(@Param("role") String role,@Param("userId") int userId);

    @Update("update user set pwd = #{pwd} where userId = #{userId}")
    int changePwd(@Param("userId") int userId,@Param("pwd") String pwd);

    @Select("select * from user")
    @Results(value = {
            @Result(id = true,property = "userId",column = "userId"),
            @Result(property = "name",column = "name"),
            @Result(property = "pwd",column = "pwd"),
            @Result(property = "role",column = "role"),
            @Result(property = "email",column = "email"),
            @Result(property = "headImage",column = "headImage"),
    })
    List<User> findAllUser();

    @Delete("delete from user where userId = #{userId}")
    int remove(@Param("userId") int userId);
}
