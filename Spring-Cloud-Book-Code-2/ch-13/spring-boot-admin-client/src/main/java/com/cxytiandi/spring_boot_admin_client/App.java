package com.cxytiandi.spring_boot_admin_client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Spring Boot Admin Client端示列
 *
 * @author yinjihuan
 *
 * @about http://cxytiandi.com/about
 *
 * @date 2018-12-16
 *
 */
@SpringBootApplication
@Slf4j
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		log.info("启动成功: http://localhost:9092");
	}
}
