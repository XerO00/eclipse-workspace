package com.infotech.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware{

	private Point center;
	@Autowired
    private MessageSource messagesource;	
    
    private ApplicationEventPublisher publisher;

    public Point getCenter() {
		return center;
	}

    @Required
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw() {
		System.out.println(this.messagesource.getMessage("greeting",null, "Default Greeting", null));
		
		System.out.println("Circle draw Method intiated !");		

		System.out.println(this.messagesource.getMessage("drawingPoint", new Object[] {center.getX(), center.getY()},"Default point Message",null));
		//System.out.println("Point" + center.getX() +" "+ center.getY());
		
		DrawEvent event = new DrawEvent(this);
	  publisher.publishEvent(event);
	}
	public MessageSource getMessagesource() {
		return messagesource;
	}

	
	public void setMessagesource(MessageSource messagesource) {
		this.messagesource = messagesource;
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		System.out.println("Inside setApplicationEventPublisher");
		this.publisher=publisher;
	}
	/*
    @PostConstruct
	public void intialize() {
		//System.out.println("Initializing");
		}

    @PreDestroy   // This is not workin and all other annotations are also not 
	public void destroying() {
		System.out.println("Before the Destroy");
		}
*/

}