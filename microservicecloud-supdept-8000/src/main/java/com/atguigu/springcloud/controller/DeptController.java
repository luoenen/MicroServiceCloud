package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	public DeptService service;
	
	@Autowired
	public DiscoveryClient client;
	
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		
		return service.add(dept);
	}
	
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable Long id) {
		return service.get(id);
	}
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list(){
		
		return service.list();
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index() {
		return service.index();
	}
	
	@RequestMapping(value="/dept/discovery")
	public Object discovery() {
		
		List<String> list = client.getServices();
		System.err.println("************************"+list);
		List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-DEPT");
		for(ServiceInstance instance:instances) {
			System.err.println(instance.getHost()+"----"+instance.getPort()+"-----"+instance.getServiceId()+"------"+instance.getUri());
		}
		
		return client;
	}
	
}
