package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptApplicationHashBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(DeptApplicationHashBoard.class, args);
	}

}
