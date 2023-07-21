package com.spring.javaconfig.withoutxml;

import org.springframework.stereotype.Component;
//bean configure
//@Component("firststudent")
public class Student {
	
	private Samosa samosa; //dependency inject
	
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		this.samosa = samosa;
	}
	public void study() {
		this.samosa.display();
		System.out.println("Student is reading book");
	}
}
