package com.educandoweb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post , String>{

}
