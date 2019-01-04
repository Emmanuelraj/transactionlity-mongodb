package com.example.transactionalitydemo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.transactionalitydemo.model.UserDTO;
import com.example.transactionalitydemo.repository.UserMongoDBRepository;



@EnableMongoRepositories(basePackageClasses=UserMongoDBRepository.class)
@Configuration
public class UserMongoDBConfig 
{
    
	
	
	@Bean
  CommandLineRunner commandLineRunner(UserMongoDBRepository userMongoDBRepository)
  {
	  return strings ->
	  {
		  UserDTO user4 = new UserDTO("John", "Technical", 300L);
		  userMongoDBRepository.save(user4);
	  };
  }
  
	
	
	
}
