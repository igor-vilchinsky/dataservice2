package com.datacenter.repositories;

import org.springframework.data.repository.CrudRepository;

import com.datacenter.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	Employee findByName(String name);

}