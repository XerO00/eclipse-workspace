package org.koushik.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.koushik.javabrains.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
//	System.out.println("TEST");	
    UserDetails user= new  UserDetails();
    user.setId(3);
    user.setUserName("");
  //  System.out.println("TEST 1");
    try {
  // System.out.println("TEST 2");	
    SessionFactory sesssionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sesssionFactory.openSession();  
	session.beginTransaction();
	session.save(user);
	session.getTransaction().commit();	
//	System.out.println("TEST 3");
	}
    catch (Exception e) {
		e.printStackTrace(); // TODO: handle exception
	}
    
	}
}
