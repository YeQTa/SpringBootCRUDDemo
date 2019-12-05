package com.yektaanilaksoy.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yektaanilaksoy.springboot.cruddemo.entity.Employee;

public interface EmployeeSpringDataJpaRepository extends JpaRepository<Employee, Integer> {

	/**
	 *  No need to write any code.
	 *  Spring Data will produce;
	 *  findById(...)
	 *  findAll()
	 *  save(...)
	 *  deleteById(...)
	 *  ...others...
	 */
}
