package com.zm.servicelogin.service;

import com.zm.servicelogin.bean.User;
import com.zm.servicelogin.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired(required = false)
    private UserMapper userMapper;

    public User login(User user){
        User person = userMapper.findUser(user.getName(),user.getPwd());
        if(person != null){
            return person;
        }
        return null;
    }
}
