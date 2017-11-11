package com.zm.servicelogin.web;

import com.zm.servicelogin.bean.User;
import com.zm.servicelogin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/",consumes = "application/json")
    public User login(@RequestBody User user){
        User person = loginService.login(user);
        return person;
    }

    @GetMapping("/")
    public String test(){
        return "login";
    }
}
