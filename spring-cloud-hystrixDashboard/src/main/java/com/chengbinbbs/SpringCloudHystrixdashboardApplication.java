package com.chengbinbbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class SpringCloudHystrixdashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystrixdashboardApplication.class, args);
	}
}
