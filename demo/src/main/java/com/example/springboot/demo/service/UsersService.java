package com.example.springboot.demo.service;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.demo.domain.Users;
import com.example.springboot.demo.repository.UsersRepository;

@Service
public class UsersService {
	@Autowired
	private UsersRepository repository;
	public List<Users> fetchAllusers(){
		return (List) repository.findAll();
	}
	public List fetchAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	public String addUser(Users users) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
