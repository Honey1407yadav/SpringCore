package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	//3 type se annotation ko inject kr sakte h
	
	@Autowired  // property ke upr ye annotation use krte h 1st type ye h
	@Qualifier("temp2") 
	private Address address;

	public Address getAddress() {
		return address;
	}

//	@Autowired   setter method ke upr use kr sakte h 2nd
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
	}

	//@Autowired  // 3rd constructor ke upr 
	public Emp(Address address) {
		this.address = address;
	}
	
	public Emp() {
		
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
