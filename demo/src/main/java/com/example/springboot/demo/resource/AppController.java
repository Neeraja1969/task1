package com.example.springboot.demo.resource;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.demo.domain.Users;
import com.example.springboot.demo.service.UsersService;

@RestController
public class AppController {
	@Autowired
	private UsersService service;
	
	@GetMapping(value="/users", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Users> getUsers(){
		return service.fetchAllUsers();
		
	}
	
	@PostMapping(value="/addUser", produces=MediaType.APPLICATION_JSON_VALUE)
	public String addUser(@RequestBody Users users) {
		return service.addUser(users);
	}

}
