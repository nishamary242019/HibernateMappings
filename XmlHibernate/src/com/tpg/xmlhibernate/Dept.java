package com.tpg.xmlhibernate;

import java.util.Set;

import com.tpg.xmlhibernate.Emp;

public class Dept {
	
	private int departmentId; 
	private String departmentName; 
	
	private Set<Emp> emps;

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

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	
	

}
