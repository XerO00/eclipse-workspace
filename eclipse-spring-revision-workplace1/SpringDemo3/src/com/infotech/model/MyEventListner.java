package com.infotech.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.w3c.dom.events.EventListener;

@Component
public class MyEventListner implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
	
		System.out.println("MyEvenListner "+ event.toString());
	}

}
