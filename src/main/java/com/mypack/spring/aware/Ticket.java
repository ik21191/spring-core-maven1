package com.mypack.spring.aware;

public class Ticket {
	private static int counter = 0;
	int id;
	public Ticket() {
		counter++;
		id = counter;
	}
	
	public int getId() {
		return id;
	}
}
