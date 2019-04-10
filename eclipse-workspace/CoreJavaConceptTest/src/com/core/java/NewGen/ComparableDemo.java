package com.core.java.NewGen;

import java.util.*;

public class ComparableDemo {

	public static void main(String[] args) {
		List <Suport> li = new ArrayList <Suport>();
	    li.add(new Suport("S"));
	    li.add(new Suport("Z"));
	    li.add(new Suport("T"));

	    Collections.sort(li);
	    System.out.println(li.get(0).code);	    
	}
}
