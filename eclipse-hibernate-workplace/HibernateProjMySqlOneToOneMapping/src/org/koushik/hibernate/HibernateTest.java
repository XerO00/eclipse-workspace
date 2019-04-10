package org.koushik.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.koushik.javabrains.dto.UserDetails;
import org.koushik.javabrains.dto.Vehicle;

public class HibernateTest 
{
	public static void main(String[] args)
 {
    UserDetails user= new  UserDetails();
    user.setUserName("Vishal");
       
    Vehicle vehicle= new Vehicle();
    vehicle.setVehicleName("Lexus");
    
    user.setVehicle(vehicle);
    
    try 
    {
    SessionFactory sesssionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sesssionFactory.openSession();  
	session.beginTransaction();
	session.save(user);
	session.save(vehicle);
	session.getTransaction().commit();	
    }
    catch (Exception e) 
    {
		e.printStackTrace(); // TODO: handle exception
	}
    
 }
}
