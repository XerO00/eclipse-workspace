package com.core.java.concept.multiThreading;

public class JoinMethodExp extends Thread{  
	 public void run(){  
	  for(int i=1;i<=5;i++){  
	   try{  
	    Thread.sleep(500);  
	   }catch(Exception e){System.out.println(e);}  
	  System.out.println(i + " Name= "+Thread.currentThread().getName());  
	  }  
	 }  
	public static void main(String args[]){  
	 JoinMethodExp t1=new JoinMethodExp();  
	 JoinMethodExp t2=new JoinMethodExp();  
	 JoinMethodExp t3=new JoinMethodExp();  
	 t1.start();  
	 
	 try{  
	  t1.join();  
	 }catch(Exception e){System.out.println(e);}  
	  
	 t2.start();  
	 t3.start();  
	 }  
	}  