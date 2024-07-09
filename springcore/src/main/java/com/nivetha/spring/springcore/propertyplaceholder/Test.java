package com.nivetha.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/nivetha/spring/springcore/propertyplaceholder/config.xml");
		MyDAO MyDAO = (MyDAO) context.getBean("myDAO");
		System.out.println(MyDAO);

	}

}
