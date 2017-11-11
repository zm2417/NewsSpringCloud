package com.zm.servicelogin;

import com.zm.servicelogin.bean.User;
import com.zm.servicelogin.service.LoginService;
import com.zm.servicelogin.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceLoginApplicationTests {

	@Autowired
	private LoginService loginService;

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
		User user = new User();
		user.setName("zm");
		user.setPwd("zm");
		User person = loginService.login(user);
		System.out.println(person.getUserId());
	}

	@Test
	public void findAll(){
		List<User> persons = userService.findAllUser();
		System.out.println("person1 = "+persons.get(0).toString());
		System.out.println("person2 = "+persons.get(1).toString());
	}

}
