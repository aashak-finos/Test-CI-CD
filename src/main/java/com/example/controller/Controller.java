package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Pojo.Pojo;
import com.example.Service.ServiceFile;

import jakarta.websocket.server.PathParam;


@RestController
@RequestMapping("/first")
public class Controller {

	private ServiceFile service;
	
	@Autowired
	public Controller(ServiceFile service) {
	this.service =service;
	}
	
	
	@PostMapping("/post")
	public Integer GetMethod(@RequestBody Pojo data, @PathParam("values") Integer values) {
		 service.add(data);
		 System.out.println("Post");
		 return values;
	}
	
//	@GetMapping(value = "/{ID}")
//	public Pojo variable(@PathVariable("ID") Long id) {
//		return service.getdata(id);
//	}
	
	@GetMapping(value = "/{values}")
	public String StringTest(@PathVariable() String values) {
		return values;
	}
	
}
	



