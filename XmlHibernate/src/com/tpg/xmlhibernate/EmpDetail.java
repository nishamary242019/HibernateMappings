package com.tpg.xmlhibernate;

import com.tpg.xmlhibernate.Emp;

public class EmpDetail {
	
	private int id;
	private String street;
	private String state;     
	private String country;
	
	private Emp emp;
	
	public EmpDetail(){
		
	}
	
	public EmpDetail(int id,String street,String state,String country){
		this.id=id;
		this.street=street;
		this.state=state;
		this.country=country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	

}
