package com.infotech.model;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent{

	public DrawEvent(Object source) {
		super(source);
      System.out.println("passing to super");
	}
 
	public String toString()
	{
	return "Draw event occured";	
	}
}
