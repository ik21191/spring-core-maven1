package com.mypack.spring.method.lookup;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreatePizza {
	private static Logger log = Logger.getLogger(CreatePizza.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = null;
		try {
			applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			log.info("Creating two pizzas....");
			PizzaShop pizzaShop = (PizzaShop)applicationContext.getBean("pizzaShop");
			Pizza pizza1 = pizzaShop.makePizza();
			log.info("First pizza id : " + pizza1.getPizzaId());
			Pizza pizza2 = pizzaShop.makePizza();
			log.info("Second pizza id : " + pizza2.getPizzaId());
		} catch(Exception e) {
			log.error(e);
		}
		
	}
}
