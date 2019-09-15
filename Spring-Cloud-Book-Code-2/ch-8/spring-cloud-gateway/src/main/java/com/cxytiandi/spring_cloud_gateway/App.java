package com.cxytiandi.spring_cloud_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Cloud Gateway示例
 *
 * @author yinjihuan
 *
 * @about http://cxytiandi.com/about
 *
 * @date 2018-12-19
 *
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("访问地址: " + "http://localhost:2001/course");
		System.out.println("访问地址: " + "http://localhost:2001/blog/user/1");
	}
}
