package com.example2;


import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("10001")
	private int empID;
	@Value("Bhavana")
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Address adrs;
	//constructor method to inject the dependency
	//public Employee(Address adr) {
		//this.adrs = adr;
	//}
	
	//setter method to inject the dependency
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	
	public void showAddressofEmployee() {
		adrs.showAddress();
	}
	

}
