package com.core.java.concept.test;

public class OuterClassForInnerClassTest {

	public void testMethod() {
	    
      	 System.out.println("printing from testMethod  of outer classes");
      	 demoClass.sysout();
      	 demoInterface.sysout();
   	}
	
	DemoInterface demoInterface= new DemoInterface() {
		
		 public void sysout() {
				// TODO Auto-generated method stub v   
				  System.out.println("printing from demoInerface anonymous class method");
			}	
	};
	
	DemoClass demoClass = new DemoClass() {
	  public void sysout() {
		// TODO Auto-generated method stub v   
		  System.out.println("printing from demoClass anonymous class method");
	}	
	};
	
    static class InnerClass{
    	void InnerClassMethod(){
    		System.out.println("printing from innner class method");
    	
    	}
    	public void testMethod() {
    	    
       	 System.out.println("printing from testMethod ");
        
    	}
    }
	
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Main Method");
      
      OuterClassForInnerClassTest.InnerClass innerClassObj=  new OuterClassForInnerClassTest.InnerClass();
	  innerClassObj.InnerClassMethod();
	  innerClassObj.testMethod();

	  OuterClassForInnerClassTest outerClassObj = new OuterClassForInnerClassTest();
	  outerClassObj.testMethod();
	}

	
}
