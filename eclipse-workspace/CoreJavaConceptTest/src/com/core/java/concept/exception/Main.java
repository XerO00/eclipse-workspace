package com.core.java.concept.exception;
import java.security.Permission;

public class Main
{

  public static void main(String... argv)
    throws Exception
  {
     try
     {
      System.exit(0);
     }
     catch(Exception e)
     {
    	 System.out.println("Inside the catch");
     }
     finally
     {
      System.err.println("I'm not dead yet!");
      System.exit(1);
     }
  }
}