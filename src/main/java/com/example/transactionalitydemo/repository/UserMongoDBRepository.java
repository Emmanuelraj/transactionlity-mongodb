package com.example.transactionalitydemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.example.transactionalitydemo.model.UserDTO;

@Repository
public interface UserMongoDBRepository extends MongoRepository<UserDTO, String>
{

}
