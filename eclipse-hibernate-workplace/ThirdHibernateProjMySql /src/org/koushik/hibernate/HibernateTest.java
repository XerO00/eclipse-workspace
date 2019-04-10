package org.koushik.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.koushik.javabrains.dto.Address;
import org.koushik.javabrains.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {

    //	System.out.println("TEST");	
    
    Address addressHome = new Address();
	addressHome.setCity("HomeKanpur");
	addressHome.setState("UttarPradesh");
	
	Address addressOffice= new Address();
	addressOffice.setCity("OfficeMumbai");
	addressOffice.setState("Maharashtra");	
	
	UserDetails user= new  UserDetails();

	user.setUserName("Abdul");
    user.setJoiningDate(new Date(2012,12,05));
    user.setOfficeAddress(addressOffice);
    user.setHomeAddress(addressHome);
    user.setDescription("Superstar of bollywood");
    
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
