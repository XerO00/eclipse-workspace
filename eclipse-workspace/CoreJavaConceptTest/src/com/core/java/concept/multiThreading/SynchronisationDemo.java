package com.core.java.concept.multiThreading;

class institute{
	
  synchronized public void accessClass() {
		 // synchronized(institute.class) {
		    	for (int i = 0; i < 5; i++) {
					try {
						System.out.println("block:" + Thread.currentThread().getName());
			 		   	Thread.sleep(100);
			 		   	
					  }
				   catch(InterruptedException e) {
					   //System.out.println("block:" + Thread.currentThread().getName());
					 }	
			    }
			//}
		  }
	
     synchronized public static void accessClass1() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("access1:" + Thread.currentThread().getName());
	 		   	Thread.sleep(100);
	 		   	 }
		   catch(InterruptedException e) {
			 //  System.out.println("access1:" + Thread.currentThread().getName());
			   
		   }	
	    }
	}
  
}
class UserThread extends Thread{
	
	 public institute ins;
	 
	 UserThread(institute ins) {
	 this.ins= ins;
	}
	 
	public void run() {

	    ins.accessClass1();
		ins.accessClass();
        
	}
}

public class SynchronisationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		institute inst = new institute();
		institute inst1 = new institute();
		
		UserThread thread= new UserThread(inst);
		UserThread thread1= new UserThread(inst1); 
		
		thread.setName("thread");
		thread1.setName("thread1");
		
		thread.start();
		thread1.start();

		inst.accessClass();
		inst1.accessClass1();
	}

	@Override
	public String toString() 
	{
	/*
	
		Object inst;
		if(this.equals(inst))
		{
			return "Inst";
		}
		else
		{
			return "Inst1";
	*/
		return "Prasanna from toString method";
	}
}