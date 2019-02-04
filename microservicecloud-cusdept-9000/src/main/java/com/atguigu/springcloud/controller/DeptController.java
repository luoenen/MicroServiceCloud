package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entities.Dept;
import com.google.common.collect.ImmutableClassToInstanceMap;

@RestController
public class DeptController {

	private static final String INSTANCE = "http://MICROSERVICECLOUD-DEPT";
	@Autowired
	public RestTemplate restTemplate;
	
	@RequestMapping(value="/consumer/add")
	public Boolean add(Dept dept) {
		
		return restTemplate.postForObject(INSTANCE+"/dept/add", dept, Boolean.class);
	}
	
	@RequestMapping(value="/consumer/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		
		return restTemplate.getForObject(INSTANCE+"/dept/get/"+id, Dept.class);
	}
	
	@RequestMapping(value="/consumer/list")
	public List<Dept> add() {
		
		return restTemplate.getForObject(INSTANCE+"/dept/list", List.class);
	}
	@RequestMapping(value="/consumer/discovery")
	public Object discovery() {
		
		return restTemplate.getForObject(INSTANCE+"/dept/discovery", Object.class);
	}
}
