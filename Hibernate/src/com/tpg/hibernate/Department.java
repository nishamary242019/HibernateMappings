package com.tpg.hibernate;

import java.util.Set;   

import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.Id; 
import javax.persistence.OneToMany; 
import javax.persistence.Table; 

@Entity@Table(name="DEPARTMENT") 
public class Department {       
	
	@Id   
	@Column(name="DEPARTMENT_ID")     
	private int departmentId;           
	
	@Column(name="DEPARTMENT_NAME")     
	private String departmentName;           
	
	@OneToMany(mappedBy="department")     
	private Set<Employee> employees;
	
	

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}       
	
	
	 
}
