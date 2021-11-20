package com.dbs.springbootjdbctemplate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employeetable")
public class Employee implements Serializable {
	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_first_name")
	private String empFirstName;
	@Column(name="emp_Last_name")
	private String empLastName;
	@Column(name="emp_Salary")
	private float empSalary;
	

}
