package com.mypack;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSetterInjection {
	private static Logger log = Logger.getLogger(AppSetterInjection.class);
    public static void main( String[] args ) {
    	ApplicationContext context = null;
    	try {
    		context = new ClassPathXmlApplicationContext("setter-injection.xml");
        	User user = (User) context.getBean("userBean");
        	log.info(user.getRoll()+"  "+user.getName()+" "+user.getCource().getId()+"  "+user.getCource().getName());
    	} catch(Exception e) {
    		log.error(e);
    	}
    	
    }
}
