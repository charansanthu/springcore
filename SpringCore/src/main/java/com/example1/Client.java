package com.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1 = (Employee) ctx.getBean("emp1");
		System.out.println("Employee ID: "+emp1.getEmpID());
		System.out.println("Employee name: "+emp1.getEmpName());
		System.out.println("Employee Band: "+emp1.getEmpBand());

	}

}
