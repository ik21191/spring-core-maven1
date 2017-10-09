package com.mypack.spring.method.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreatePizza {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Creating two pizzas....");
		PizzaShop pizzaShop = (PizzaShop)applicationContext.getBean("pizzaShop");
		Pizza pizza1 = pizzaShop.makePizza();
		System.out.println("First pizza id : " + pizza1.getPizzaId());
		Pizza pizza2 = pizzaShop.makePizza();
		System.out.println("Second pizza id : " + pizza2.getPizzaId());
	}
}
