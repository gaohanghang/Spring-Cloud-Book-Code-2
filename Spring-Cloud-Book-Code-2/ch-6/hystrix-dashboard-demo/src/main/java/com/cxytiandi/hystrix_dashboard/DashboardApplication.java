package com.cxytiandi.hystrix_dashboard;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
@Slf4j
public class DashboardApplication {
	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
		log.info("项目启动启动成功！hystrix: http://localhost:9011/hystrix");
		log.info("项目启动启动成功！turbine: http://localhost:9011/turbine.stream");
	}
}
