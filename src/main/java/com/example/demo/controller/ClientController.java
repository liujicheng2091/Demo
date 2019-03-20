package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@RequestMapping(value = "/search/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)	
	public String hello(HttpServletRequest request){
		return request.getRequestURL().toString();
	}
	
}
