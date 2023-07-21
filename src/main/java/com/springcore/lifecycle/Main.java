package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//registering shutdown hook
		context.registerShutdownHook(); //ye method sirf abstractApplicationContext ke pass hi h
		
//		SamosaUsingXml s1 = (SamosaUsingXml) context.getBean("s1");
//		System.out.println(s1);
//		
//		System.out.println("---------------------------------");
//		
//		PepsiUsingInterfaces p1 = (PepsiUsingInterfaces) context.getBean("p1");
//		System.out.println(p1);
//	
//		System.out.println("---------------------------------");
		
		ExampleUsingAnnotations example = (ExampleUsingAnnotations) context.getBean("example");
		System.out.println(example);
	}
}
