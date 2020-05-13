package com.spring.boot.docker.dao;

import java.util.List;

import com.spring.boot.docker.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();

	void insertEmployee(Employee employee);
}