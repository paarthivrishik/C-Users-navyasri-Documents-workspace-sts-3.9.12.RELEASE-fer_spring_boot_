package com.rs.fer.employee.service.impl;

import com.rs.fer.bean.Employee;
import com.rs.fer.employee.service.EmployeeService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

	private Map<Integer, Employee> employeeMap = new HashMap<>();
	private int nextEmployeeId = 1;

	@Override
	public void addEmployee(Employee employee) {
		employee.setEmployeeId(nextEmployeeId++);
		employeeMap.put(employee.getEmployeeId(), employee);
	}

	@Override
	public void updateEmployee(int employeeId, Employee employee) {
		if (employeeMap.containsKey(employeeId)) {
			employee.setEmployeeId(employeeId);
			employeeMap.put(employeeId, employee);
		} else {
			System.out.println("Employee with ID " + employeeId + " not found.");
		}
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return employeeMap.get(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return new ArrayList<>(employeeMap.values());
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeMap.remove(employeeId);
	}
}