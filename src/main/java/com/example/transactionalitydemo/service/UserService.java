package com.example.transactionalitydemo.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.transactionalitydemo.model.UserDTO;

@Service
public class UserService 
{
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	
	//insert
	public void insert(List<UserDTO> users)
	{
		System.out.println("insert method");
		
		
		for(UserDTO user:users)
		{
			
		
		
		jdbcTemplate.update("INSERT INTO  USER (name,dept,salary) VALUES (?,?,?) ", new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException 
			{
				// TODO Auto-generated method stub
			    System.out.println("insert the values");	
				
			    ps.setString(1, user.getName());
			    ps.setString(2, user.getDept());
			    ps.setLong(3, user.getSalary());
				
			}
		});
		
		}
		
	}
	
	
	
	
	
	public List<UserDTO> getUser()
	{
		
		System.out.println("getAllUser Method");
		
		List<UserDTO> ls  = jdbcTemplate.query("select name, dept, salary from USER", new RowMapper<UserDTO>()
		{

			@Override
			public UserDTO mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				  return new UserDTO(rs.getString("name"),
									 rs.getString("dept"),
									 rs.getLong("salary"));
				  
				  
			}
			
		}); 
		
		return ls;
		
	 }
	
   
	
}
