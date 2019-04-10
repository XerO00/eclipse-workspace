package com.infotech.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import com.infotech.model.*;


public class DrawingApp {

	public static void main(String[] args) {
		
     //  ClassPathResource resource = new ClassPathResource("Beans.xml");
		
	//	XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));

		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("Beans.xml"));
        
		Triangle objT = new Triangle();
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		
		Shape object1 = (Shape)context.getBean("triangle");
		Shape object2= (Shape)context.getBean("circle");
		
		object1.draw();
		object2.draw();
		}
}
