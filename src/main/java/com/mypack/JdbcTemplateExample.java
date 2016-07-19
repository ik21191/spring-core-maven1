package com.mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypack.beans.Employee;
import com.mypack.dao.EmployeeDao;

public class JdbcTemplateExample 
{
    public static void main( String[] args ){
    	ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
    	EmployeeDao edao = (EmployeeDao)context.getBean("employeeDao");
    	Employee e = new Employee();
    	e.setId(101);
    	e.setName("test");
    	e.setSalary(1002);
    	edao.insert(e);
    	
    }
}

