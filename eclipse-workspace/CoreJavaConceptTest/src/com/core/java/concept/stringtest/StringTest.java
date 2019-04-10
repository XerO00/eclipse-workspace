package com.core.java.concept.stringtest;

import java.util.ArrayList;

import com.core.java.concept.GenericBound.LowerUpperBoundExp;

public class StringTest {

	
	 public static void main(String [] args){      
         String a="prasanna";
         String b="prasanna";
         String c= new String("prasanna");
         String d= new String("prasanna");  
         String e= new String(b);
         String f=a;
         
       		 System.out.println("Inside the main");	
	   if(a==b) {
		   System.out.println("a==b is true");	
	   }
	   if(a.equals(b)) {
		   System.out.println("a.equals(b) is true");	
	   }
	   if(a.equals(c)) {
		   System.out.println("a.equals(c) is true");	
		   System.out.println();	
		   }
	   
	   if(c==d) {
		   System.out.println("c==d is true");	
	   }
	   if(c.equals(d)) {
		   System.out.println("c.equals(d) is true");	
	   }  
	   if(e==f) {
		   System.out.println("e==f is true"+ e+ f);	
	   }
	   if(e.equals(f)) {
		   System.out.println("e.equals(f) is true"+e+f);	
	   }  
	   
	   if(a==f) {
		   System.out.println("a==f is true"+ a+ f);	
	   }
	   if(a.equals(f)) {
		   System.out.println("a.equals(f) is true"+a+f);	
	   }  

	 }

}
