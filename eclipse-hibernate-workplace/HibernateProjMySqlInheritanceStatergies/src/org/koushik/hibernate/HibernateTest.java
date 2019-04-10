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
    Vehicle vehicle= new Vehicle();
    vehicle.setVehicleName("Lamborghini");
    
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
	//session.save(user);
	session.save(vehicle);
	//session.save(fourWheelarObject); //Uncommenting this line throws errororg.hibernate.NonUniqueObjectException: a different object with the same identifier value was already associated with the session: [org.koushik.javabrains.dto.FourWheelar#0]
	//session.save(twoWheelObject);
	session.getTransaction().commit();
	session.close();
	}
    catch (Exception e) 
    {
		e.printStackTrace(); // TODO: handle exception
	}
    
 }
}
