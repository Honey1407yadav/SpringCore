package com.spring.javaconfig.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		//is package me xml file use nhi krenge to uski jgh javaconfig name ki class bnayenge or usme sab declare krenge
		//or yha classpath ki jgh annotationconfig denge
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		//Student student = context.getBean("firststudent", Student.class);  //@Component("firststudent"
		Student student = context.getBean("student", Student.class);  //@bean 

		System.out.println(student);
		
		student.study();
	}
}
