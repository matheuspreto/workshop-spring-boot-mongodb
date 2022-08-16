package com.educandoweb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
