package com.datacenter.services;

import com.datacenter.model.Employee;

public interface EmployeeService {

	Employee getEmployee(Long id);

	void saveEmployee(Employee employee);

	//boolean isEmployeeExist(Employee employee);

}