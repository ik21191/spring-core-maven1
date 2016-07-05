package com.mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ){
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	User obj = (User) context.getBean("userBean");
    	System.out.println(obj.getName());
    	System.out.println(obj.getRoll());
    	//System.out.println(obj.getCource().getId()+"   "+obj.getCource().getName());
    	System.out.println("List: " + obj.getList());
    	System.out.println("List: " + obj.getSet());
    	System.out.println("List: " + obj.getMap());
    }
}
