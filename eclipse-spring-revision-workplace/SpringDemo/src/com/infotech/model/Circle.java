package com.infotech.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Circle implements Shape{

	private Point center;
	
	public Point getCenter() {
		return center;
	}

    @Autowired	
   	public void setCenter( @Qualifier("CircleRelated")Point center) {
		this.center = center;
	}
	
	
	@Override
	public void draw() {
		System.out.println("Circle");		
		System.out.println("Point \n      1)" + center.getX() +"\n      2)"+ center.getY());
	}
}