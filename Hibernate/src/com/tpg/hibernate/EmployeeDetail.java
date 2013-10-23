package com.tpg.hibernate;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity@Table(name="emp_details") 
public class EmployeeDetail {           
	@Id    
	@Column(name="id", unique=true, nullable=false)     
/*	@GeneratedValue(generator="gen")     
	@GenericGenerator(name="gen", strategy="foreign", 
		parameters=@Parameter(name="property", value="employee"))     */
	private int id;           
	
	@Column(name="street")     
	private String street;       
	
	@Column(name="state")     
	private String state;       
	
	@Column(name="country")     
	private String country;           
	
	@OneToOne    
	@PrimaryKeyJoinColumn    
	private Employee employee;       
	
	public EmployeeDetail() {       }       
	
	public EmployeeDetail(int id,String street,String state, String country) {         
		this.id=id;
		this.street = street;         
		this.state = state;         
		this.country = country;     
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}       
	

	
 
}
