package com.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp2 = ctx.getBean(Employee.class);
		System.out.println("Emp name: "+emp2.getName());
		System.out.println("Emp ID:"+emp2.getEmpID());
		
		emp2.showAddressofEmployee();

	}
}