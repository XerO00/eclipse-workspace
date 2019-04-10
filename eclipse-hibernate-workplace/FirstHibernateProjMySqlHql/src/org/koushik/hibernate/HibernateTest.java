package org.koushik.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.koushik.javabrains.dto.UserDetails;

public class HibernateTest 
{
	public static void main(String[] args)
  {   
   try
    {
   
    SessionFactory sesssionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sesssionFactory.openSession();  
    session.beginTransaction();	
/*	for (int i = 0; i < 4; i++) 
	  {		
	    UserDetails user= new  UserDetails();	
		user.setUserName("user"+i);
		session.save(user);	 	 	    
      }
      
*/  
  	Query query=session.getNamedQuery("UserDetails.byName");
   // query.setFirstResult(3);
   // query.setMaxResults(5);	
    query.setString(0, "user3");
    List<UserDetails>users = 	(List<UserDetails>)query.list();
   
    for(UserDetails user: users)
    {	
      System.out.println("Name of this user is " + user.getUserName());
    }
  	
	
    session.getTransaction().commit();	
    session.close();
    }
    catch (Exception e) 
    {
		e.printStackTrace(); // TODO: handle exception
	}
   
}
}