package com.core.java.concept.GenericBound;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LowerUpperBoundExp {

    public static void validateTillStringType(Collection<? super String> collection){
        //Wild card with Lower bound
        // Accept collection of objects of type string or SUPER-CLASS of String
      	collection.add("Pravin");
    	collection.add("Prasad");
    	collection.add("Ramesh");
    	
    	Object ob = new Object();
    //	collection.add(ob);
    	for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
    		
			String object =  (String) iterator.next();
			System.out.println(object);
		} 
    }

    public static void validateStringTypes(Collection<? extends String> collection){
        //Wild card with Upper bound
        // Accept collection of objects of type string or SUB-CLASS of String
    	
    	System.out.println(collection.size());
    	collection.remove("Pravin");
    	System.out.println(collection.size());
    }

    public static void main(String [] args){      
        LowerUpperBoundExp.validateTillStringType(new ArrayList<Object>());//OK

     //   LowerUpperBoundExp.validateTillStringType(new ArrayList<Integer>());//Error

     //    LowerUpperBoundExp.validateStringTypes(new ArrayList<Object>());//Error

        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Pravin");
        
        LowerUpperBoundExp.validateStringTypes(arrayList);//OK

    }

}