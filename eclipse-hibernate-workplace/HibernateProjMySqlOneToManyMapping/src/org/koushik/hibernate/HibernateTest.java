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
    user.setUserName("Rahul");
       
    Vehicle vehicle= new Vehicle();
    vehicle.setVehicleName("Nissan");
    
    Vehicle vehicle1= new Vehicle();
    vehicle1.setVehicleName("Ford");
    
    user.getVehicle().add(vehicle);
    user.getVehicle().add(vehicle1);
    
    try 
    {
    SessionFactory sesssionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sesssionFactory.openSession();  
	session.beginTransaction();
	session.save(user);
	session.save(vehicle);
	session.save(vehicle1);
	session.getTransaction().commit();
	session.close();
	}
    catch (Exception e) 
    {
		e.printStackTrace(); // TODO: handle exception
	}
    
 }
}
