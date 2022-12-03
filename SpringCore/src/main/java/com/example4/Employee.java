package com.example4;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int empID;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Autowired
	private Address adrs;
	public Address getAdrs() {
		return adrs;
	}
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
