package com.example.vultrtsetjar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VultrTsetjarApplication {

	public static void main(String[] args) {
		SpringApplication.run(VultrTsetjarApplication.class, args);
	}
}
