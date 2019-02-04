package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.atguigu.Rules.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(value="MICROSERVICECLOUD_DEPT",configuration=MySelfRule.class)
public class ConsumerApplication9000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(ConsumerApplication9000.class, args);
		
	}

}
