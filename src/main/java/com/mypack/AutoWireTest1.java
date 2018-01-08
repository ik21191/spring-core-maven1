package com.mypack;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mypack.service.StudentService;
import com.mypack.spring.aware.ApplicationContextAwareTest;

public class AutoWireTest1 {
	private static Logger log = Logger.getLogger(AutoWireTest1.class);
    private static ApplicationContext context;

	public static void main( String[] args ){
    	/*context = new ClassPathXmlApplicationContext("auto-wired1.xml");
    	StudentService s = (StudentService) context.getBean("studentService");*/
    	
    	new ClassPathXmlApplicationContext("auto-wired1.xml");
    	StudentService s = (StudentService) ApplicationContextAwareTest.getApplicationContext().getBean("studentService");
    	log.info(s.createNewStudent());
    	
    }
}
