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
	addressHome.setCity("HomeChenanai");
	addressHome.setState("TamlNadu");
	
	Address addressOffice= new Address();
	addressOffice.setCity("OfficeDelhi");
	addressOffice.setState("Delhi");	
	
	UserDetails user= new  UserDetails();

	user.setUserName("Sidharth");
    user.setJoiningDate(new Date(2013,12,05));
    user.setDescription("Superstar of bollywood");
    
    user.getListOfAddresses().add(addressHome);
    user.getListOfAddresses().add(addressOffice);
    
    //  System.out.println("TEST 1");
    
    try {
    
    // System.out.println("TEST 2");	
  
    SessionFactory sesssionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sesssionFactory.openSession();  
	session.beginTransaction();
	session.save(user);
	session.getTransaction().commit();
    session.close();	
    //	System.out.println("TEST 3");
	
    user= null;
    session = sesssionFactory.openSession();  
    user = (UserDetails)session.get(UserDetails.class, 1);
    
    System.out.println("Printing Object "+ user.getListOfAddresses());
    }
    catch (Exception e) {
		e.printStackTrace(); // TODO: handle exception
	}
    
	}
}
