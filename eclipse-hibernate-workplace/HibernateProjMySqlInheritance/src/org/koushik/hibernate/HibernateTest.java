package org.koushik.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.koushik.javabrains.dto.FourWheelar;
import org.koushik.javabrains.dto.TwoWheelar;
import org.koushik.javabrains.dto.UserDetails;
import org.koushik.javabrains.dto.Vehicle;

public class HibernateTest 
{	
	public static void main(String[] args)
 {
    UserDetails user= new  UserDetails();
    user.setUserName("Arun");
       
    Vehicle vehicle= new Vehicle();
    vehicle.setVehicleName("Toyota");
    
    Vehicle vehicle1= new Vehicle();
    vehicle1.setVehicleName("Bajaj");
    
    user.getVehicle().add(vehicle);
    user.getVehicle().add(vehicle1);
    
    TwoWheelar twoWheelObject= new TwoWheelar();
    twoWheelObject.setTwoWheelType("TwoWheelar Hyusang");
    twoWheelObject.setVehicleName("This is two wheelar name");
    
    FourWheelar fourWheelarObject = new FourWheelar();
    fourWheelarObject.setFourWheelType("Four Wheelar Verron");
    fourWheelarObject.setVehicleName("This is four wheelar name");
    try 
    {
    SessionFactory sesssionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sesssionFactory.openSession();  
	session.beginTransaction();
	session.persist(user);
	session.save(twoWheelObject);
	session.save(fourWheelarObject);
	session.getTransaction().commit();
	session.close();
	}
    catch (Exception e) 
    {
		e.printStackTrace(); // TODO: handle exception
	}
    
 }
}
