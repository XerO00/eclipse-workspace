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
    user.setUserName("Sohail");

    UserDetails user1= new  UserDetails();
    user.setUserName("Saif");
       
    Vehicle vehicle= new Vehicle();
    vehicle.setVehicleName("Benz");
    
    Vehicle vehicle1= new Vehicle();
    vehicle1.setVehicleName("Suzuki");
    
    user.getVehicle().add(vehicle);
    user.getVehicle().add(vehicle1);
    
    user1.getVehicle().add(vehicle);
    user1.getVehicle().add(vehicle1);
    
    vehicle.getUserList().add(user);
    vehicle1.getUserList().add(user);

    vehicle.getUserList().add(user1);
    vehicle1.getUserList().add(user1);
  
    try 
    {
    SessionFactory sesssionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sesssionFactory.openSession();  
	session.beginTransaction();
	session.save(user);
	session.save(user1);
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
