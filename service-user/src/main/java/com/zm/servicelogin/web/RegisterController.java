package com.zm.servicelogin.web;

import com.zm.servicelogin.bean.User;
import com.zm.servicelogin.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/register")
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping(value = "/",consumes = "application/json")
    public int register(@RequestBody User user){
        return registerService.register(user);
    }
}
