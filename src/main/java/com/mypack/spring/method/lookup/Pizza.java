package com.mypack.spring.method.lookup;

public class Pizza {
	private static int count = 0;
	private int pizzaId;
	public Pizza() {
		count++;
		pizzaId = count;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Pizza.count = count;
	}
	public int getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}
}
