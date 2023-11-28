package com.training.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sesfact= new Configuration().configure("Hiber.cfg.xml").
				addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Address.class).buildSessionFactory();
		Session ses=sesfact.openSession();
		Transaction tx=ses.beginTransaction();
		Employee emp=new Employee();
		emp.setEmpid(1);
		emp.setEmpname("Bharath");
		emp.setSalary(15000);
		Address aobj=new Address();
		aobj.setAddressid(2);
		aobj.setHouseno(13);
		aobj.setCity("Delhi");

		ses.save(aobj);
		emp.setAddobj(aobj);
		
		ses.save(emp);
		tx.commit();
		System.out.println("Data is saved");
	}

}
