package com.datacenter.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datacenter.model.Employee;
import com.datacenter.repositories.EmployeeRepository;
import com.datacenter.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public Employee getEmployee(Long id) {
		return employeeRepository.findOne(id);
	}

	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	/*@Override
	@Transactional
	public boolean isEmployeeExist(Employee employee) {
		if (employeeRepository.findByName(employee.getName()) == null) {
			return false;
		} else {
			return true;
		}
	}*/
}