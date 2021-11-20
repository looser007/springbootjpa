package com.dbs.springbootjdbctemplate.service;


import java.util.List;
import java.util.Optional;

import com.dbs.springbootjdbctemplate.dto.Employee;

public interface EmployeeService {
	public Employee createEmployee(Employee employee);
    public Employee deleteEmployee(int i);
    public Employee updateEmployee(String empId, Employee employee);
    public Optional<Employee> getEmployeeById(int empId);
    public Optional<List<Employee>> getEmployees();
    public Optional<List<Employee>> getEmployeesByLastName(String empLastName);
    public Optional<Employee> getEmployeesByIdLastName(int empId,String empLastName);

}
