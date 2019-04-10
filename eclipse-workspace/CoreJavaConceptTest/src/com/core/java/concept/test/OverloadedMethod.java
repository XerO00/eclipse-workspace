package com.core.java.concept.test;

public class OverloadedMethod{     
    /*
	public void test(long obj) {
        System.out.println("long ");
    }
    public void test(double obj) {
        System.out.println("double");
    } 
    public void test(float obj) {
        System.out.println("float");
    } 
    public void test(int obj) {
        System.out.println("int");
    } 
    public void test(Integer i) {
        System.out.println("Integer");
    }

    public void test(Object i) {
        System.out.println("Object");
    }
    public void test(Long l) {
        System.out.println("Long");
    } 
       public void test(char i, Character j) {
    	  System.out.println("method 1");
    	 }
    	 public void test(Character i, Character j) {
    	  System.out.println("method 2");
    	 } 
    */   	   	     	 
    	 public void test(int... i) {
    		  System.out.println("method 1");
    		 }
    		 public void test(Integer... i) {
    		  System.out.println("method 2");
    		 } 
 	 
    public static void main(String[] args) {
        OverloadedMethod obj = new OverloadedMethod();
   //     obj.test(2.9f);
        short s = 10;
        Short s1 = new Short((short) 1);
        //System.out.println(null);
       //  obj.test(s1); 
     //   obj.test('a','a');
  //      obj.test(1);
    }
}
