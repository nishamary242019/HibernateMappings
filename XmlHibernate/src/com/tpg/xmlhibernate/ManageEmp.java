package com.tpg.xmlhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.tpg.xmlhibernate.Emp;
import com.tpg.xmlhibernate.EmpDetail;

public class ManageEmp {
	 private static SessionFactory factory; 
	   public static void main(String[] args) {
	      try{
	    	   factory = new AnnotationConfiguration().configure().addAnnotatedClass(Emp.class).buildSessionFactory();
	    	   Session session = factory.openSession();
	    	   Transaction tx = null;
	    	   tx = session.beginTransaction();
	    	   
	    	   Dept dept = new Dept();         
	    	   dept.setDepartmentId(2);
	    	   dept.setDepartmentName("Marketing");         
	    	   session.save(dept); 
	    	   
	    	   EmpDetail empDetail = new EmpDetail(8,"15th Street", "tamil nadu","india");                   
	    	   Emp emp1 = new Emp(8,"Nisha", "Mary", 5000,2);  
	    	   emp1.setDept(dept);
	    	   emp1.setEmpDetail(empDetail);        
	    	   empDetail.setEmp(emp1);                             
	    	   session.save(emp1); 
	    	  	    	   
	    	   
	    	   
	    	   tx.commit();
	    	   System.out.println("finished");
	    	      
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         ex.printStackTrace();
	        // throw new ExceptionInInitializerError(ex); 
	      }
	   }

}
