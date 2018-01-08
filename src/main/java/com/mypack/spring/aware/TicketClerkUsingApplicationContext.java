package com.mypack.spring.aware;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TicketClerkUsingApplicationContext implements ApplicationContextAware {
	private static Logger log = Logger.getLogger(TicketClerkUsingApplicationContext.class);

	// private Ticket ticket;
	private ApplicationContext applicationContext = null;
	
	public TicketClerkUsingApplicationContext() {
		log.info("TicketClerkUsingApplicationContext is created.");
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
