package com.core.java.concept.multiThreading;

public class MultithreadingConceptClass extends Thread{

	private Thread main;
    @Override
    public void run() {
    	
    	//main= Thread.currentThread();
		System.out.println("first line of run=  " + Thread.currentThread().getName());
     	
    	try {
    	
    		System.out.println("printing below after try= " + Thread.currentThread().getName());
         	Thread.currentThread().join();
         	System.out.println("printing below after join= " + Thread.currentThread().getName());
            
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
    	}
    	for (int i = 0; i < 10; i++) {
    		try {
    			System.out.println("printing from user thread " + Thread.currentThread().getName());
     		   	Thread.sleep(500);
     		   	
    		  }
    	   catch(InterruptedException e) {
    		   System.out.println("printing from user thread " + Thread.currentThread().getName());
    		   
    	   }	
        }
    }
	public static void main(String[] args) throws InterruptedException{
		
		// TODO Auto-generated method stub
      
	  Thread multithreadingConceptClass = new MultithreadingConceptClass();
      multithreadingConceptClass.setName("usedThread");
      System.out.println("Staring userThread");
      multithreadingConceptClass.start();
      
      for (int i = 0; i < 10; i++) {
		System.out.println("Main "+ Thread.currentThread().getName());
		Thread.sleep(500);

      }
	}

}
