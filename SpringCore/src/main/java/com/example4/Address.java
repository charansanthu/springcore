package com.example4;

public class Address {
	
	private String street;
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void showAddress() {
		System.out.println("street name is "+getStreet());
		System.out.println("Address of the employee is Bangalore");
	}

}
