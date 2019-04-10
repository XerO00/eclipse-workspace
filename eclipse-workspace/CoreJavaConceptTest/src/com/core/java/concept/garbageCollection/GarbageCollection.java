package com.core.java.concept.garbageCollection;

public class GarbageCollection extends Object{
 
	@Override
	protected void finalize() throws Throwable {
      System.out.println("Calling finalizer");
	}
	
	public static void main(String[] args) {
		System.out.println("Main starts from here");
	    garbageCollectionsTest();
	    GarbageCollection test = new GarbageCollection();
		test=null;
	    System.gc();
	
		System.out.println("End of program");
	}
	
	 
	public static void garbageCollectionsTest() {
		
		System.out.println("garbageCollectionsTest() :");
		 
		GarbageCollection test = new GarbageCollection();
		GarbageCollection test1 = new GarbageCollection();
		
		
	}
}
