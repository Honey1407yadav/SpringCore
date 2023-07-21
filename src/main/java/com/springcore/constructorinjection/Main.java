package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
		Person p =  (Person) context.getBean("person");
		System.out.println(p);
		
		
		//Addition bean 
		Addition ad = (Addition) context.getBean("add");
		ad.doSum();
	}
}
