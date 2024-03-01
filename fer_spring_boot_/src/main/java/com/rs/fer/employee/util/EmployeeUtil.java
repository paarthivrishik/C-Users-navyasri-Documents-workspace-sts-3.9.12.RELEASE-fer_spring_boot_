package com.rs.fer.employee.util;

import java.util.List;

import com.rs.fer.bean.Employee;

public interface EmployeeUtil {

	    public static boolean isValidEmployee(Employee employee) {
	        return isNonNullAndNonEmpty(employee.getFirstName())
	                && isNonNullAndNonEmpty(employee.getLastName())
	                && isNonNullAndNonEmpty(employee.getEmail())
	                && isValidEmail(employee.getEmail())
	                && isNonNullAndNonEmpty(employee.getDoj())
	                && employee.getSalary() > 0;
	    }

	    
	    public static boolean isValidEmail(String email) {
	        // Basic email validation, you might want to use a more comprehensive validation method
	        return email != null && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
	    }

	    public static boolean isNonNullAndNonEmpty(String str) {
	        return str != null && !str.trim().isEmpty();
	    }

	    public static boolean isValidPhoneNumbers(List<String> phoneNumbers) {
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

	    public static boolean isValidPhoneNumber(String phoneNumber) {
	        // Basic phone number validation, you might want to use a more comprehensive validation method
	        return phoneNumber != null && phoneNumber.matches("\\d{10}");
	    }
	}
