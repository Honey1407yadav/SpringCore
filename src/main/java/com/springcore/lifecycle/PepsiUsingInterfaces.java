package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PepsiUsingInterfaces implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public PepsiUsingInterfaces() {
	
	}

	@Override
	public String toString() {
		return "PepsiUsingInterfaces [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
	       	//init ke liye work krega 
			System.out.println("Taking pepsi : init");
	}

	public void destroy() throws Exception {
		//destroy ke liye work krega 
		System.out.println("Going to put bottel back to shop : destroy");
	}
	
	
	
}
