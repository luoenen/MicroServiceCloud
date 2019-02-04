package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptApplication8000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SpringApplication.run(DeptApplication8000.class, args);
	}

}
