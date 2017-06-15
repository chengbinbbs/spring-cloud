package com.chengbinbbs;

import com.chengbinbbs.module.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudUserserviceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudUserserviceApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		User user = new User("zhangsan",23);
		System.out.println(user.toString());
	}
}
