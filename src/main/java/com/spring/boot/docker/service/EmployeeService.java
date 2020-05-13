package com.spring.boot.docker.service;

import java.util.List;

import com.spring.boot.docker.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}