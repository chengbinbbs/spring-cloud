package com.chengbinbbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class SpringCloudTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTurbineApplication.class, args);
	}
}
