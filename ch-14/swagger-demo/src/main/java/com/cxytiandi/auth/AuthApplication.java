package com.cxytiandi.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.spring4all.swagger.EnableSwagger2Doc;

@EnableDiscoveryClient
@EnableSwagger2Doc
@SpringBootApplication
@Slf4j
public class AuthApplication {
	public static void main(String[] args) {
	    SpringApplication.run(AuthApplication.class, args);
		System.out.println("http://localhost:8081/swagger-ui.html");
	}
}
