package com.spring.javaconfig.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//configuration krne ke liye @configuration use krenge
@Configuration
//@ComponentScan(basePackages ="com.spring.javaconfig.withoutxml")   //bean ko configure kene ke liye yadi @Component use kr rhe ho to ye use krna h agr @Bean use kr rhe ho to ye jaruri nhi h use krna
public class JavaConfig {
	@Bean
	public Samosa getSamosa() //dependency inject
	{
		return new Samosa();
	}
	
	
	@Bean(name = {"student","temp","con"})
	public Student getStudent()
	{
		//creating a new student object
		Student student=new Student(getSamosa());
		return student;
	}
}
