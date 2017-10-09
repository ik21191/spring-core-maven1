package com.mypack.objectCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactoryMethodWithArguement {
    private static ApplicationContext context;

	public static void main(String[] args) {
    	context = new ClassPathXmlApplicationContext("staticFactoryMethodWithArguement.xml");
    	X obj = (X)context.getBean("x");
    	obj.display();
    }
}
