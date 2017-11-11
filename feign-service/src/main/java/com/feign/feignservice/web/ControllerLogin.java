package com.feign.feignservice.web;

import com.feign.feignservice.bean.User;
import com.feign.feignservice.service.ServiceLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLogin {
    @Autowired
    ServiceLogin serviceLogin;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody User user){
        return serviceLogin.login(user);
    }
}
