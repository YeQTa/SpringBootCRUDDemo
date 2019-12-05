package com.yektaanilaksoy.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yektaanilaksoy.springboot.cruddemo.dao.EmployeeDAO;
import com.yektaanilaksoy.springboot.cruddemo.dao.EmployeeSpringDataJpaRepository;
import com.yektaanilaksoy.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	/**
	 * Remove @Transactional when using Spring Data JPA
	 * As it provides it internally.
	 */
	//Spring data field injection
	//@Autowired
	//private EmployeeSpringDataJpaRepository employeeSpringDataJpaRepository;
	
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDAOJpaImpl")EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		return employeeDAO.findById(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		employeeDAO.deleteById(id);
	}

}
