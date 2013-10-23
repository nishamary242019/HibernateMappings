package com.tpg.hibernate;
import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
   @Id 
   @Column(name = "id")
   private int id;

   @Column(name = "first_name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "salary")
   private int salary; 
  
   @Column(name = "department_id")
   private int departmentId;
   
   @ManyToOne    
   @JoinColumn(name="department_id",insertable=false,updatable=false)     
   private Department department; 
   
   @OneToOne(mappedBy="employee", cascade=CascadeType.ALL)     
   private EmployeeDetail employeeDetail; 

   public Employee() {}
   
   public Employee(int id,String firstName,String lastName,int salary,int departmentId){
	   this.id=id;
	   this.firstName=firstName;
	   this.lastName=lastName;
	   this.salary=salary;
	   this.departmentId=departmentId;
   }
   
   public int getId() {
      return id;
   }
   public void setId( int id ) {
      this.id = id;
   }
   public String getFirstName() {
      return firstName;
   }
   public void setFirstName( String first_name ) {
      this.firstName = first_name;
   }
   public String getLastName() {
      return lastName;
   }
   public void setLastName( String last_name ) {
      this.lastName = last_name;
   }
   public int getSalary() {
      return salary;
   }
   public void setSalary( int salary ) {
      this.salary = salary;
   }

public EmployeeDetail getEmployeeDetail() {
	return employeeDetail;
}

public void setEmployeeDetail(EmployeeDetail employeeDetail) {
	this.employeeDetail = employeeDetail;
}

public int getDepartmentId() {
	return departmentId;
}

public void setDepartmentId(int departmentId) {
	this.departmentId = departmentId;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}
   
  
}