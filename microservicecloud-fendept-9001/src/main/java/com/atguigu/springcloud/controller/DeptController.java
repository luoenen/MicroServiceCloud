package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
import com.google.common.collect.ImmutableClassToInstanceMap;

@RestController
public class DeptController {

	@Autowired
	public DeptClientService service;
	
	@RequestMapping(value="/consumer/dept/add")
	public Boolean add(Dept dept) {
		
		return service.add(dept);
	}
	
	@RequestMapping(value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		
		return service.get(id);
	}
	
	@RequestMapping(value="/consumer/dept/list")
	public List<Dept> add() {
		
		return service.list();
	}
}
