package com.springcore.lifecycle;

public class SamosaUsingXml {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting property");
		this.price = price;
	}

	public SamosaUsingXml() {
		
	}

	@Override
	public String toString() {
		return "SamosaUsingXml [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy()
	{
		System.out.println("Inside Destroy method");
	}
}
