package com.example.transactionalitydemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.transactionalitydemo.model.UserDTO;
import com.example.transactionalitydemo.repository.UserMongoDBRepository;

@RestController
public class UserMongoDBController 
{
	
	
	@Autowired
	private UserMongoDBRepository userMongoDBRepository;
	
    @GetMapping("/all")
	public List<UserDTO> getList()
	{
		return userMongoDBRepository.findAll();
	}
    
    
   
	
	
}
