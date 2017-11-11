package com.zm.servicecontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceContentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceContentApplication.class, args);
	}
}
