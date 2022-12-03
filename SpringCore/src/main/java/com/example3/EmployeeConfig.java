package com.example3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig {
	@Scope("prototype")
	@Bean
	public Employee employee() {
		return new Employee();
	}
	

}
