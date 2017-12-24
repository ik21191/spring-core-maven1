package com.mypack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypack.beans.A;



public class AutoWireTest 
{
    public static void main( String[] args ) {
    	ClassPathXmlApplicationContext context = null;
    	//ApplicationContext context = null;
    	try {
    		context = new ClassPathXmlApplicationContext("auto-wired.xml");
        	A a = (A) context.getBean("a");
        	a.getB().display();
    	} catch(Exception e) {
    		System.out.println(e);
    	} finally {
    		context.close();
    	}
    	
    }
}
