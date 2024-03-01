package com.rs.fer.employee.validation.impl;

import com.rs.fer.bean.Employee;
import java.util.List;

public interface EmployeeValidationImpl {

	/**
	 * Add a new employee.
	 * 
	 * @param employee The employee object to add.
	 */
	void addEmployee(Employee employee);

	/**
	 * Update an existing employee.
	 * 
	 * @param employeeId The ID of the employee to update.
	 * @param employee   The updated employee object.
	 */
	void updateEmployee(int employeeId, Employee employee);

	/**
	 * Retrieve an employee by ID.
	 * 
	 * @param employeeId The ID of the employee to retrieve.
	 * @return The employee object if found, null otherwise.
	 */
	Employee getEmployeeById(int employeeId);

	/**
	 * Retrieve all employees.
	 * 
	 * @return A list of all employees.
	 */
	List<Employee> getAllEmployees();

	/**
	 * Delete an employee by ID.
	 * 
	 * @param employeeId The ID of the employee to delete.
	 */
	void deleteEmployee(int employeeId);
}
