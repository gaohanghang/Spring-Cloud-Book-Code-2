package com.cxytiandi.spring_boot_example;

import com.cxytiandi.demo.EnableUserClient;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.cxytiandi.spring_boot_example.base.StartCommand;

@EnableAsync
@SpringBootApplication
@EnableSwagger2Doc
public class App {
	public static void main(String[] args) {
		//new StartCommand(args);
		SpringApplication.run(App.class, args);
	}
}
