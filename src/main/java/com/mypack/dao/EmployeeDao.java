package com.mypack.dao;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.mypack.beans.Employee;



public class EmployeeDao implements Dao{

	SimpleJdbcTemplate jdbcTemplate;
	public void insert(Employee emp) {
		String sql = "insert into Employee values("+emp.getId()+",'"+emp.getName()+"',"+emp.getSalary()+")";
		jdbcTemplate.update(sql);
	}
	
	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
