package com.zm.servicecomment.service;

import com.zm.servicecomment.bean.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-user")
public interface UserFeignService {
    @RequestMapping(value = "/user/findUserById/",method = RequestMethod.GET)
    User findUserById(@RequestParam(value = "id") int id);
}
