package com.rs.fer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rs.fer.bean.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		return null;
		// Implement validation logic and store employee details
		// Return appropriate response based on success or failure
	}
}
