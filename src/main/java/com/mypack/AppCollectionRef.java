package com.mypack;

import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCollectionRef {
	private static Logger log = Logger.getLogger(AppCollectionRef.class);
	
    public static void main( String[] args ) {
    	ApplicationContext context = null;
    	try {
    		context = new ClassPathXmlApplicationContext("collection-injection-ref.xml");
        	Student student = (Student) context.getBean("studentBean");
        	/*if(student.getCourceList().size()>0){
        		System.out.println("Displaying cource list.......");
        		for(Cource c : student.getCourceList()){
        			System.out.println("ID: "+c.getId() + "  " +c.getName());
        		}
        	}*/
        	if(student.getCourceProjectMap().size()>0){
        		log.info("Displaying cource project map.......");
        		for(Entry<Cource, Project> entry : student.getCourceProjectMap().entrySet()){
        			Cource cource = entry.getKey();
        			Project project = entry.getValue();
        			log.info(cource.getId()+ " "+cource.getName() +"  ||  "+project.getId()+"  "+project.getName());
        		}
        	}
    	} catch(Exception e) {
    		log.error(e);
    	}
    	
    }
}
