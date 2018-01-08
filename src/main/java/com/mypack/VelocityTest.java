package com.mypack;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.velocity.VelocityEngineUtils;

public class VelocityTest {
	private static Logger log = Logger.getLogger(VelocityTest.class);
	
    public static void main( String[] args ) {
    	ApplicationContext context = null;
    	try {
    		context = new ClassPathXmlApplicationContext("velocity-conf.xml");
        	VelocityEngine velocityEngine = (VelocityEngine) context.getBean("velocityEngine");
        	Map<String,String> map = new HashMap<String,String>();
        	map.put("name", "Imran Khan");
        	log.info("==========" +velocityEngine);
        	String ss= VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,"abc.vm","UTF-8", map);
        	log.info(ss);
        } catch(Exception e) {
    		log.error(e);
    	} 
    }
}
