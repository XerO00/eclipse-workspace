package org.koushik.hibernate;

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
      
*/  UserDetails user= (UserDetails) session.get(UserDetails.class, 3);
//    user.setUserName("Prasanna");
	session.getTransaction().commit();
  	session.close();
   
  	session=sesssionFactory.openSession(); 
    session.beginTransaction();
    user.setUserName("PRasanna Now changed e");
    session.update(user);
  	session.getTransaction().commit();	
    
    session.close();
	}
    catch (Exception e) 
    {
		e.printStackTrace(); // TODO: handle exception
	}
    
  }
}
