package com.example.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springboot.demo.domain.Users;
import com.example.springboot.demo.repository.UsersRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private UsersRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	public void run(String... args)throws Exception {
		Users user=new Users("","","","", 1);
		repository.save(user);
	}
	

}
