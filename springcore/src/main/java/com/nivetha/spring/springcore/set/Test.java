package com.nivetha.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nivetha.spring.springcore.list.Hospital;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/nivetha/spring/springcore/set/setconfig.xml");
		CarDealer CarDealer = (CarDealer) context.getBean("cardealer");
		System.out.println("Name:"+CarDealer.getName());
		System.out.println("Models"+CarDealer.getModels());

	}

}
