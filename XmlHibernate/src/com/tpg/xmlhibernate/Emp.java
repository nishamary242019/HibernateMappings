package com.tpg.xmlhibernate;

import com.tpg.xmlhibernate.EmpDetail;

public class Emp {
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private int departmentId;
	
	private EmpDetail empDetail;
	private Dept dept;
	
	public Emp(){
		
	}
	
	public Emp(int id,String firstName,String lastName,int salary,int departmentId){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		this.departmentId=departmentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public EmpDetail getEmpDetail() {
		return empDetail;
	}

	public void setEmpDetail(EmpDetail empDetail) {
		this.empDetail = empDetail;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
	 

}
