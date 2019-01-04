package com.example.transactionalitydemo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserDTO {

	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	private String name;
	
	private String dept;
	
	private Long salary;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * @return the salary
	 */
	public Long getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public UserDTO(String name, String dept, Long salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

	
	
	
	

}
