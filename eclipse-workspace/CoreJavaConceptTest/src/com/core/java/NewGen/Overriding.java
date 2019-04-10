package com.core.java.NewGen;


public class Overriding extends SuperOverriding{

	public Long getLenght() {
		return new Long(5);
		
	}
	public static void main (String[] args) {
		Overriding o = new Overriding();
		
		/*
		SuperOverriding so = new SuperOverriding();
	//	so.getLenght();
		System.out.println(so.getLenght().toString()+", " +
	o.getLenght().toString());
	}
*/
		try {
		 o.methodCheck();
	     System.out.println("A");
		}
		catch (RuntimeException e) {
			 System.out.println("B");
			 }
		catch (Exception e) {
			System.out.println("C");
		}
		finally {
			System.out.println("D");
			
		}
       System.out.println("E");
}
	public  void methodCheck() throws Exception{
		
		throw new Exception();
	}
	}