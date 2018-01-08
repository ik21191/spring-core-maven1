package com.mypack.spring.aware;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CreateTicketUsingBeanFactoryAware {
	private static Logger log = Logger.getLogger(CreateTicketUsingBeanFactoryAware.class);

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		TicketClerkUsingBeanFactory ticketClerk = (TicketClerkUsingBeanFactory)beanFactory.getBean("ticketClerkUsingBeanFactory");
		Ticket ticket1 = ticketClerk.getTicket();
		log.info(ticket1.getId());
		Ticket ticket2 = ticketClerk.getTicket();
		log.info(ticket2.getId());
	}

}
