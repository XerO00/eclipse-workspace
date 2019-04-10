package com.codebind;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  
public static void main(String[] args) throws Exception {

	System.out.println("Printing from main \n");
	ApplicationContext context = new ClassPathXmlApplicationContext(
			"beans.xml");
/*
	HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	obj.printHello();

*/
	CustomerBo customer = (CustomerBo) context.getBean("customerBo");
	customer.addCustomerAround("Prasanna");
}		
	}
