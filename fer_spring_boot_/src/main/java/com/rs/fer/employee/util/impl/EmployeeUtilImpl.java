package com.rs.fer.employee.util.impl;

import java.util.List;

import com.rs.fer.bean.Employee;
import com.rs.fer.employee.util.EmployeeUtil;

public class EmployeeUtilImpl implements EmployeeUtil {

	public boolean isValidEmployee(Employee employee) {
		if (employee == null) {
			return false;
		}

		return isValidId(employee.getEmployeeId()) && isValidName(employee.getFirstName())
				&& isValidName(employee.getLastName()) && isValidEmail(employee.getEmail())
				&& isValidPhoneNumbers(employee.getPhoneNumbers()) && isValidDateOfJoining(employee.getDoj())
				&& isValidSalary(employee.getSalary());
	}

	private boolean isValidId(int id) {
		return id > 0;
	}

	private boolean isValidName(String name) {
		return name != null && !name.trim().isEmpty();
	}

	private boolean isValidEmail(String email) {
		// Basic email validation, you might want to use a more comprehensive validation
		// method
		return email != null && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
	}

	private boolean isValidPhoneNumbers(List<String> phoneNumbers) {
		if (phoneNumbers == null || phoneNumbers.isEmpty()) {
			return false;
		}

		for (String phoneNumber : phoneNumbers) {
			if (!isValidPhoneNumber(phoneNumber)) {
				return false;
			}
		}

		return true;
	}

	private boolean isValidPhoneNumber(String phoneNumber) {
		// Basic phone number validation, you might want to use a more comprehensive
		// validation method
		return phoneNumber != null && phoneNumber.matches("\\d{10}");
	}

	private boolean isValidDateOfJoining(String doj) {
		// You can implement your own validation logic for Date of Joining
		// For simplicity, we assume any non-null date is valid in this example
		return doj != null;
	}

	private boolean isValidSalary(double salary) {
		return salary > 0;
	}
}
