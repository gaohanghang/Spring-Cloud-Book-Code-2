package com.cxytiandi.zuul_demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul整合Swagger示列
 *
 * @author yinjihuan
 *
 * @about http://cxytiandi.com/about
 *
 * @date 2019-01-05
 *
 */
@EnableZuulProxy
@SpringBootApplication
@Slf4j
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("http://localhost:2103/swagger-ui.html");
	}
}
