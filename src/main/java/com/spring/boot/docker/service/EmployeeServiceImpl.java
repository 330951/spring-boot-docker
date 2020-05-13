package com.spring.boot.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.docker.dao.EmployeeDao;
import com.spring.boot.docker.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeDao.getAllEmployees();
		return employees;
	}

	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
		
	}

}