package com.mypack.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mypack.beans.Employee;



public class EmployeeDao implements Dao{

	JdbcTemplate jdbcTemplate;
	public void insert(Employee emp) {
		String sql = "insert into Employee values("+emp.getId()+",'"+emp.getName()+"',"+emp.getSalary()+")";
		jdbcTemplate.update(sql);
	}
	
	public void insert(List<Employee> empList) {
		String sql = "insert into Employee values(?,?,?)";
		List<Object[]> parameters = new ArrayList<Object[]>();
		for(Employee e : empList){
			parameters.add(new Object[]{e.getId(), e.getName(), e.getSalary()});
		}
		jdbcTemplate.batchUpdate(sql, parameters);
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
