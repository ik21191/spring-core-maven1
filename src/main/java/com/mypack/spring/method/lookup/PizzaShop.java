package com.mypack.spring.method.lookup;

public abstract class PizzaShop {
	public PizzaShop() {
		System.out.println("PizzaShop is created.");
	}
	public abstract Pizza makePizza();
}
