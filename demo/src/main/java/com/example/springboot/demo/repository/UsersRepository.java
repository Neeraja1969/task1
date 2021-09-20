package com.example.springboot.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springboot.demo.domain.Users;

public interface UsersRepository extends MongoRepository<Users, String> {

}
