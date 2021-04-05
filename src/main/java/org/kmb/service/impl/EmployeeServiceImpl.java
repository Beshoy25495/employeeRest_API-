package org.kmb.service.impl;

import java.util.List;
import java.util.Optional;

import org.kmb.exception.ConflictException;
import org.kmb.exception.NotFoundException;
import org.kmb.model.Employee;
import org.kmb.repository.EmployeeRepository;
import org.kmb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
//		try {
			Optional<Employee> optional = employeeRepository.findById(id);
			Employee employee = optional.get();
			return employee;
/*		} catch (Exception e) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", id));
		}*/
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>)employeeRepository.findAll();
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	@Override
	public boolean isEmployeeExist(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.existsById(id);
	}
	
	/*
	 * public Employee save(Employee Employee) { if
	 * (employeeRepository.findByName(Employee.getName()) != null) { throw new
	 * ConflictException("Another record with the same name exists"); }
	 * 
	 * return employeeRepository.save(Employee); }
	 */
	

}
