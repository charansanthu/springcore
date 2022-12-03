package com.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp3 = ctx.getBean(Employee.class);
		System.out.println("Emp ID:"+emp3.getEmpID());
		System.out.println("Emp Name:"+emp3.getEmpName());
		System.out.println("Emp Band:"+emp3.getEmpBand());
		System.out.println("----------------");
		emp3.setEmpID(448);
		emp3.setEmpName("srujana");
		emp3.setEmpBand("B2");
		System.out.println("Emp ID:"+emp3.getEmpID());
		System.out.println("Emp Name:"+emp3.getEmpName());
		System.out.println("Emp Band:"+emp3.getEmpBand());
		System.out.println("----------------");
		
		
		Employee emp = ctx.getBean(Employee.class);
		System.out.println("Emp ID:"+emp.getEmpID());
		System.out.println("Emp Name:"+emp.getEmpName());
		System.out.println("Emp Band:"+emp.getEmpBand());
		
		
		
	}
}