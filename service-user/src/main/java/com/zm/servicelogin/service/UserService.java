package com.zm.servicelogin.service;

import com.zm.servicelogin.bean.User;
import com.zm.servicelogin.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    public List<User> findAllUser(){
        List<User> persons = new ArrayList<User>();
        persons = userMapper.findAllUser();
        return persons;
    }

    public User findUser(int userId){
        return userMapper.findUserById(userId);
    }
}
