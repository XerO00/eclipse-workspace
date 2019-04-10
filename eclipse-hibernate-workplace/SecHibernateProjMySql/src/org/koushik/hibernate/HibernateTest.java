package org.koushik.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.koushik.javabrains.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
//	System.out.println("TEST");	
    UserDetails user= new  UserDetails();
    user.setUserName("Amir");
    user.setJoiningDate(new Date(2012,12,05));
    user.setAddress("Mumbai");
    user.setDescription("He is from Mumbai and superstar of bollywood");
    //  System.out.println("TEST 1");
    try {
  // System.out.println("TEST 2");	
    SessionFactory sesssionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sesssionFactory.openSession();  
	session.beginTransaction();
	session.save(user);
	session.getTransaction().commit();	
//	System.out.println("TEST 3");
	
	user= null;
    session = sesssionFactory.openSession();  
	session.beginTransaction();
	user= (UserDetails) session.get(UserDetails.class,1);
	System.out.println("UserDetails Obejct Name"+ user.getUserName());
	
    }
    catch (Exception e) {
		e.printStackTrace(); // TODO: handle exception
	}
    
	}
}
