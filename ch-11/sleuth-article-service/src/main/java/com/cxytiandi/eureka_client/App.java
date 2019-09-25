package com.cxytiandi.eureka_client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;


/**
 * Eureka客户端示列
 *
 * @author yinjihuan
 *
 * @about http://cxytiandi.com/about
 *
 * @date 2018-12-22
 *
 */
@EnableAsync
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		log.info("启动成功: http://localhost:8082/article/callHello");
	}
}
