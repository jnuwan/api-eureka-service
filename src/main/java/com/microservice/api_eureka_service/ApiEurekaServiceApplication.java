package com.microservice.api_eureka_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApiEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiEurekaServiceApplication.class, args);
	}

}
