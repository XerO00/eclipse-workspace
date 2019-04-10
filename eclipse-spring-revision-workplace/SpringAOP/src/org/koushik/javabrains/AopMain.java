package org.koushik.javabrains;

import org.koushik.javabrains.service.ShapeService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.koushik.javabrains.service.ShapeService;
                                   	
public class AopMain {

	public static void main(String[] args) throws Exception 
	{

		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService= ctx.getBean("shapeService",ShapeService.class);	
       // System.out.println("Name of Circle  "+shapeService.getCircle().getName() 
        //		+ "\nName of Triangle  "+shapeService.getTriangle().getName()
        	//	+ "\nType of Triangle  "+shapeService.getTriangle().getType());
	//	System.out.println("Name of Circle  "+shapeService.getCircle().getName() );
		shapeService.getCircle().setName("Prasanna setting on march 31 for revision of AOP");
	}

}
 