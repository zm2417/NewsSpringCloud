package com.zm.servicelogin.web;

import com.zm.servicelogin.bean.User;
import com.zm.servicelogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/User")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findUserById")
    public User findUserById(int id){
        return userService.findUser(id);
    }
}
