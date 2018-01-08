package com.mypack.spring.aware;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreateTicketUsingApplicationContextAware {
	private static Logger log = Logger.getLogger(CreateTicketUsingApplicationContextAware.class); 

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		TicketClerkUsingApplicationContext ticketClerk = (TicketClerkUsingApplicationContext)applicationContext.
				getBean("ticketClerkUsingApplicationContext");
		Ticket ticket1 = ticketClerk.getTicket();
		log.info(ticket1.getId());
		Ticket ticket2 = ticketClerk.getTicket();
		log.info(ticket2.getId());
	}
}
