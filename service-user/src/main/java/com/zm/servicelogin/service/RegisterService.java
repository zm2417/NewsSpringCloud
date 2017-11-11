package com.zm.servicelogin.service;

import com.zm.servicelogin.bean.User;
import com.zm.servicelogin.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired(required = false)
    private UserMapper userMapper;

    public int register(User user){
        return userMapper.add(user.getName(),user.getPwd(),user.getEmail());
    }
}
