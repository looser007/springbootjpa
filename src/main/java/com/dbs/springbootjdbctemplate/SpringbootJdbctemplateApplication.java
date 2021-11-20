package com.dbs.springbootjdbctemplate;

import javax.sql.DataSource;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dbs.springbootjdbctemplate.dto.Employee;
import com.dbs.springbootjdbctemplate.service.EmployeeService;



@SpringBootApplication
public class SpringbootJdbctemplateApplication {

	public static void main(String[] args) {
	ApplicationContext  applicationContext =SpringApplication.run(SpringbootJdbctemplateApplication.class, args);
	DataSource dataSource = applicationContext.getBean(DataSource.class);
	System.out.println(dataSource!=null);
	EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
	Employee employee = new Employee(3,"mahesh","gmk",75000);
	Employee employee2 = employeeService.createEmployee(employee);
	System.out.println(employee2);
	System.out.println("==================ById==========");
   Optional<Employee> optional=employeeService.getEmployeeById(1);
	System.out.println(optional);
	
	System.out.println("=====all records");
	Optional<List<Employee>> optionals=employeeService.getEmployees();
	if(optional.isPresent()) {
		System.out.println(optionals.get());
	}
	else {
		System.out.println("record not found");
	}
	System.out.println("===============byLastName==========");
   Optional<List<Employee>> optional2=employeeService.getEmployeesByLastName("gmk");
	
	if(optional2.isPresent()) {
		System.out.println(optional2.get());
	}
	else {
		System.out.println("record not found");
	}
	System.out.println("===================byLastNameand Id=====");
	Optional<Employee> optional3=employeeService.getEmployeesByIdLastName(3,"gmk");
	System.out.println(optional3);
	
	
	}

}
