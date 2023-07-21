package com.spring.core.primitive.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String ar[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/primitive/type/primitiveconfig.xml");
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);

		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);

		Student student3 = (Student) context.getBean("student3");
		System.out.println(student3);
	}
}
