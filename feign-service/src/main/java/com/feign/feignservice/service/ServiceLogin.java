package com.feign.feignservice.service;

import com.feign.feignservice.bean.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-login")
public interface ServiceLogin {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    String login(@RequestBody User user);
}
