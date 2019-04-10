package org.koushik.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
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
  	
    
   // UserDetails user = (UserDetails)session.get(UserDetails.class,1);
    
    //below is example for usage of queryCache
    Query query=session.createQuery("from UserDetails where userId= 1"); 
    query.setCacheable(true);
    List user= query.list();
    
    session.getTransaction().commit();	
    session.close(); /// since session is closed here hibernate will fire below queries 2 times 
    //Hibernate: select userdetail0_.USER_ID as USER1_0_0_, userdetail0_.USER_NAME as USER2_0_0_ from USER_DETAILS userdetail0_ where userdetail0_.USER_ID=?
    //Hibernate: select userdetail0_.USER_ID as USER1_0_0_, userdetail0_.USER_NAME as USER2_0_0_ from USER_DETAILS userdetail0_ where userdetail0_.USER_ID=?
    
    Session session1 =sesssionFactory.openSession(); 
    session1.beginTransaction();	
    
    //after using Casheable annotation just runs single time as below
    //Hibernate: select userdetail0_.USER_ID as USER1_0_0_, userdetail0_.USER_NAME as USER2_0_0_ from USER_DETAILS userdetail0_ where userdetail0_.USER_ID=?
    // UserDetails user1 = (UserDetails)session1.get(UserDetails.class,1);
    
    //below is example for usage of queryCache
    Query query1=session1.createQuery("from UserDetails where userId= 1"); 
    query1.setCacheable(true);
    List user1= query1.list();
        
    session1.getTransaction().commit();
    session1.close();
    
  	}
    catch (Exception e) 
     {
    	System.out.println("Session Catch");
		e.printStackTrace(); // TODO: handle exception         	
     }
   
  }
}