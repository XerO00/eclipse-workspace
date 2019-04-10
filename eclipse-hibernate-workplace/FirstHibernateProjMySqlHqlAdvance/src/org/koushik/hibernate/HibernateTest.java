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
  	
    UserDetails exampleUser= new UserDetails();
  	exampleUser.setUserName("Example  User");
    
  	Example example = Example.create(exampleUser).enableLike();
    
    //Criteria criteria = session.createCriteria(UserDetails.class).add(example);
  //criteria.add(Restrictions.or(Restrictions.between("userId", 1, 50)
	//	,Restrictions.eq("userName", "user3")) );
	
  	Criteria criteria = session.createCriteria(UserDetails.class)
                    //    .setProjection(Projections.property("userId"));
  	                   .addOrder(Order.desc("userId"));
  	
  	List<UserDetails>users =(List<UserDetails>)criteria.list();
  
  	session.getTransaction().commit();	
    session.close();
    
    for(UserDetails user: users)
       {	
       System.out.println("Name of this user is " + user.getUserName());
       }
  	 }
    catch (Exception e) 
     {
    	System.out.println("Session Catch");
		e.printStackTrace(); // TODO: handle exception         	
     }
   
}
}