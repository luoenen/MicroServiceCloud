package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(EurekaApplication7000.class, args);
	}

}
