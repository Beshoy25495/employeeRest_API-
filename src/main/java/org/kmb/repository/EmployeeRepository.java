package org.kmb.repository;

import org.kmb.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
  // Employee findByName(String name);//as Query
}
