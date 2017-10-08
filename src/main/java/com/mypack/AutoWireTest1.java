package com.mypack;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mypack.service.StudentService;

public class AutoWireTest1 {
    private static ApplicationContext context;

	public static void main( String[] args ){
    	context = new ClassPathXmlApplicationContext("auto-wired1.xml");
    	StudentService s = (StudentService) context.getBean("studentService");
    	System.out.println(s.createNewStudent());
    	
    }
}
