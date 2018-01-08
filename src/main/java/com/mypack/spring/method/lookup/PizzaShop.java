package com.mypack.spring.method.lookup;

import org.apache.log4j.Logger;

public abstract class PizzaShop {
	private static Logger log = Logger.getLogger(PizzaShop.class);
	public PizzaShop() {
		log.info("PizzaShop is created.");
	}
	public abstract Pizza makePizza();
}
