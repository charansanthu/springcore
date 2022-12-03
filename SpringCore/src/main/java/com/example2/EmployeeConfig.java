package com.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	
	//for setter injection
	 @Bean
	    public Employee employee() {
		 	Employee emp = new Employee();
	        emp.setAdrs(address());
	        return emp;
	    }

	 @Bean
	    public Address address() {
	        return new Address();
	    }
	 
	 //for constructor injection
	 //@Bean
	 // public Employee employee(){
	 //		return new Employee(new Address());
	 // }
	
	 

}
