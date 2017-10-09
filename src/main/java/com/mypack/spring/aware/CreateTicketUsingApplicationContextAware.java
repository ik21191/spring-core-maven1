package com.mypack.spring.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreateTicketUsingApplicationContextAware {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		TicketClerkUsingApplicationContext ticketClerk = (TicketClerkUsingApplicationContext)applicationContext.
				getBean("ticketClerkUsingApplicationContext");
		Ticket ticket1 = ticketClerk.getTicket();
		System.out.println(ticket1.getId());
		Ticket ticket2 = ticketClerk.getTicket();
		System.out.println(ticket2.getId());
	}
}
