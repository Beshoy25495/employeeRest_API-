package org.kmb.service;

import java.util.List;

import org.kmb.model.Employee;

public interface EmployeeService {

	public abstract Employee createEmployee(Employee employee);
	public abstract void updateEmployee(int id, Employee employee);
	public abstract Employee getEmployee(int id);
	public abstract List<Employee> getEmployees();
	public abstract void deleteEmployee(int id);
	public abstract boolean isEmployeeExist(int id);

}