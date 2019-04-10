package com.core.java.concept.exception;

import java.io.IOException;

public class Parent{  
	  void msg() throws Exception{System.out.println("parent");}  
	}  
	  
class TestExceptionChild extends Parent{  
	  void msg(){  
	    System.out.println("TestExceptionChild");  
	  }  
	  
	  public static void main(String args[]) throws Exception{  
	 
	   Parent p=new Parent();  
	   p.msg();  
	   
	  }  
	}  