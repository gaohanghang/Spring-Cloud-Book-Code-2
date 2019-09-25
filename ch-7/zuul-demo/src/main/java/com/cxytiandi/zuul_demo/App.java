package com.cxytiandi.zuul_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * Zuul示列
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
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("访问地址: " + "http://localhost:2103/hystrix-feign-demo/callHello");
		System.out.println("访问地址: " + "http://localhost:2103/api/1");
		System.out.println("访问地址: " + "http://localhost:2103/actuator/routes");
		System.out.println("访问地址: " + "http://localhost:2103/actuator/filters");
		System.out.println("访问地址: " + "http://localhost:2103/zuul-file-demo/file/upload");
	}
}
