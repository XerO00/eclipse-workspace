package com.core.java.concept.exception;

public class FinallyReturn {
	  public static final void main(String[] args) {
	    System.out.println(foo(args));
	  }

	  private static int foo(String[] args) {
	    try {
	      int n = Integer.parseInt(args[0]);
	      System.out.println("Inside the try");
	      return n;
	    }
	    catch(Exception e) 
	    {
	    	System.out.println("Inside the catch");	
	      return 2;
	    }
	    finally {
	    	System.out.println("Inside the finally");
	      return 42;
	    }
	  }
	}