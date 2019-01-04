package com.example.transactionalitydemo.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import com.example.transactionalitydemo.model.UserDTO;
import com.example.transactionalitydemo.repository.UserMongoDBRepository;
import com.example.transactionalitydemo.service.UserService;

@Component
public class UserRunner  implements CommandLineRunner
{
	
	
	@Autowired
	private UserService userService;

	
	
	
	
	
	
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		try
		{
		
		UserDTO user3 = new UserDTO("John Doe", "Technical", 1500000L);
		UserDTO user4 = new UserDTO("John", "Technical", 1500000L);
		
		
		userService.insert(Arrays.asList(user3,user4)); 
		
		System.out.println(userService.getUser());
		}
		
		
		catch(RuntimeException rex)
		{
			System.out.println("exception batch1--->"+rex.getMessage());
		}
		
		
		
		
		
		try
		{
		UserDTO user1 = new UserDTO("imman", "Tech", 1000L);
		UserDTO user2 = new UserDTO("maihi", "Technology", 1500L);
		
		
		userService.insert(Arrays.asList(user1,user2));
		
		System.out.println(userService.getUser());
		}
		catch(RuntimeException rex)
		{
			System.out.println("exception batch2--->"+rex.getMessage());
		}
	}

	
	

}
