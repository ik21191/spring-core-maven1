package com.mypack.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class TicketClerkUsingBeanFactory implements BeanFactoryAware {

	//private Ticket ticket;
	private BeanFactory beanFactory = null;
	public TicketClerkUsingBeanFactory() {
		System.out.println("BeanFactoryAwareTest created...");
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	public Ticket getTicket() {
		//return ticket;
		return (Ticket)beanFactory.getBean("ticket");
	}

	/*public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}*/
	
}
