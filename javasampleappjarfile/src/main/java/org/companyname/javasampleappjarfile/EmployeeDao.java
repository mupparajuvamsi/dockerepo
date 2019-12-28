package org.companyname.javasampleappjarfile;

import java.util.List;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}