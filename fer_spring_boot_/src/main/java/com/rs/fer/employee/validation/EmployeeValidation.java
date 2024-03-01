package com.rs.fer.employee.validation;

import java.util.List;


import com.rs.fer.bean.Employee;

public interface EmployeeValidation {

	public static boolean validateEmployee(Employee employee) {
		if (employee == null) {
			return false;
		}

		if (!isValidId(employee.getEmployeeId())) {
			return false;
		}

		if (!isValidName(employee.getFirstName())) {
			return false;
		}

		if (!isValidName(employee.getLastName())) {
			return false;
		}
		

		if (!isValidEmail(employee.getEmail())) {
			return false;
		}

		if (!isPhoneNumbers(employee.getPhoneNumbers())) {
			return false;
		}

		if (!isValidDateOfJoining(employee.getDoj())) {
			return false;
		}

		if (!isValidSalary(employee.getSalary())) {
			return false;
		}

		return true;
	}

	public static boolean isPhoneNumbers(List<String> phoneNumbers) {
		// TODO Auto-generated method stub
		return false;
	}

	static boolean isValidId(int id) {
		return id > 0;
	}

	static boolean isValidName(String name) {
		return name != null && !name.trim().isEmpty();
	}

	static boolean isValidEmail(String email) {
		// Basic email validation, you might want to use a more comprehensive validation
		// method
		return email != null && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
	}

	static boolean isValidPhoneNumbers(List<String> phoneNumbers) {
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

	static boolean isValidPhoneNumber(String phoneNumber) {
		// Basic phone number validation, you might want to use a more comprehensive
		// validation method
		return phoneNumber != null && phoneNumber.matches("\\d{10}");
	}

	static boolean isValidDateOfJoining(String doj) {
		// You can implement your own validation logic for Date of Joining
		// For simplicity, we assume any non-null date is valid in this example
		return doj != null;
	}

	static boolean isValidSalary(double salary) {
		return salary > 0;
	}
}
