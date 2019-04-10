package com.infotech.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
    @Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	
	@Override
	public void draw() {
		System.out.println("Circle");		
		System.out.println("Point \n      1)" + center.getX() +"\n      2)"+ center.getY());
	}
    @PostConstruct
	public void intialize() {
		System.out.println("Initializing");
		}

    @PreDestroy
	public void destroying() {
		System.out.println("Initializing");
		}
	
}
