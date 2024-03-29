package com.tpg.hibernate;
import java.util.List; 
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;


public class ManageEmployee {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      try{
    	  //Configuration configuration = new Configuration(); 
    	  //factory =configuration.configure().buildSessionFactory();
    	   factory = new AnnotationConfiguration().configure("/hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
    	   Session session = factory.openSession();
    	   Transaction tx = null;
    	   tx = session.beginTransaction();
    	   
    	   Department department = new Department();         
    	   department.setDepartmentId(5);
    	   department.setDepartmentName("Sales");         
    	   session.save(department); 
    	   
    	   EmployeeDetail employeeDetail = new EmployeeDetail(3,"10th Street", "San Francisco","U.S.");                   
    	   Employee employee = new Employee(3,"Nina", "Mayers", 7000,5);         
    	   employee.setEmployeeDetail(employeeDetail);        
    	   employeeDetail.setEmployee(employee);                             
    	   session.save(employee); 
    	   tx.commit();
    	   System.out.println("finished");
    	      
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         ex.printStackTrace();
        // throw new ExceptionInInitializerError(ex); 
      }
      /*ManageEmployee ME = new ManageEmployee();

       Add few employee records in database 
      Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
      Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
      Integer empID3 = ME.addEmployee("John", "Paul", 10000);

       List down all the employees 
      ME.listEmployees();

       Update employee's records 
      ME.updateEmployee(empID1, 5000);

       Delete an employee from the database 
      ME.deleteEmployee(empID2);

      List down new list of the employees 
      ME.listEmployees();*/
   }
   /* Method to CREATE an employee in the database 
   public Integer addEmployee(String fname, String lname, int salary){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      try{
         tx = session.beginTransaction();
         Employee employee = new Employee();
         employee.setFirstName(fname);
         employee.setLastName(lname);
         employee.setSalary(salary);
         employeeID = (Integer) session.save(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return employeeID;
   }
    Method to  READ all the employees 
   public void listEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         List employees = session.createQuery("FROM Employee").list(); 
         for (Iterator iterator = 
                           employees.iterator(); iterator.hasNext();){
            Employee employee = (Employee) iterator.next(); 
            System.out.print("First Name: " + employee.getFirstName()); 
            System.out.print("  Last Name: " + employee.getLastName()); 
            System.out.println("  Salary: " + employee.getSalary()); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
    Method to UPDATE salary for an employee 
   public void updateEmployee(Integer EmployeeID, int salary ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Employee employee = 
                    (Employee)session.get(Employee.class, EmployeeID); 
         employee.setSalary( salary );
		 session.update(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
    Method to DELETE an employee from the records 
   public void deleteEmployee(Integer EmployeeID){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Employee employee = 
                   (Employee)session.get(Employee.class, EmployeeID); 
         session.delete(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }*/
}