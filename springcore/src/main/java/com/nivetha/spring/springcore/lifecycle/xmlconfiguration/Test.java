package com.nivetha.spring.springcore.lifecycle.xmlconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		/*
		 * ApplicationContext context= new ClassPathXmlApplicationContext(
		 * "com/nivetha/spring/springcore/lifecycle/xmlconfiguration/config.xml");
		 */
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/nivetha/spring/springcore/lifecycle/xmlconfiguration/config.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook();
	}

}
