package com.javacuckoo.springsecurityjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacuckoo.springsecurityjpa.model.User;
import com.javacuckoo.springsecurityjpa.repository.UserRepository;

@RestController
public class HelloController {
	
	private final UserRepository userRepository;	
	
	@Autowired
	public HelloController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("/")
	public String hello() {
		return "<h1>Hello World<h1>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1>Hello User<h1>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Hello Admin<h1>";
	}
	
	@GetMapping("/users")
	public List<User> getUser(){
		return userRepository.findAll();
	}
	
	
	
	
	 

}
