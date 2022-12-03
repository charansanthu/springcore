package com.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp4 = (Employee) ctx.getBean("emp4");
		System.out.println("emp name: "+emp4.getName());
		System.out.println("emp ID: "+emp4.getEmpID());
		emp4.showAddressofEmployee();

	}

}
