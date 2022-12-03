package com.example3;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("20408569")
	private int empID;
	@Value("Bhavana")
	private String empName;
	@Value("B3")
	private String empBand;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpBand() {
		return empBand;
	}
	public void setEmpBand(String empBand) {
		this.empBand = empBand;
	}
	

}
