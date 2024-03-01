package com.rs.fer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rs.fer.bean.Employee;

@SpringBootApplication
//@PropertySource("classpath:${CONFIG_MODE}/application.properties")
public class EmployeeApplication {

	private List<Employee> employeeList = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
}