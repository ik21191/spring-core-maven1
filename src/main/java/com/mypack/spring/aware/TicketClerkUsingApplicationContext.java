package com.mypack.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TicketClerkUsingApplicationContext implements ApplicationContextAware {

	// private Ticket ticket;
	private ApplicationContext applicationContext = null;
	
	public TicketClerkUsingApplicationContext() {
		System.out.println("TicketClerkUsingApplicationContext is created.");
	}

	public Ticket getTicket() {
		// return ticket;
		return (Ticket) applicationContext.getBean("ticket");
	}

	/*
	 * public void setTicket(Ticket ticket) { this.ticket = ticket; }
	 */

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
