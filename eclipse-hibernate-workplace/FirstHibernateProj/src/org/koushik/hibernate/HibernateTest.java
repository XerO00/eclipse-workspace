package org.koushik.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.koushik.javabrains.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
    UserDetails user= new  UserDetails();
    user.setId(1);
    user.setUserName("Prasanna");
    
    try {
    SessionFactory sesssionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sesssionFactory.openSession();  
	session.beginTransaction();
	session.save(user);
	
	}
    catch (Exception e) {
		e.printStackTrace(); // TODO: handle exception
	}
    
	}
}
