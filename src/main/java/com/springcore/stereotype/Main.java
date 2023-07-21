package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = context.getBean("student", Student.class);
//		System.out.println(student);	
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
	
//		System.out.println(student.hashCode());
		//It's singleton Scopes  means object 1 hi br create hoga fir kitni bhi br call kro
//		Student student2 = context.getBean("student", Student.class);
//		System.out.println(student2.hashCode());
	
		//using xml file prototype scopes
		Teacher t1 = context.getBean("teacher", Teacher.class);
		Teacher t2 = context.getBean("teacher", Teacher.class);
	
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
}
