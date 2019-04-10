package com.core.java.NewGen;

public class Suport implements Comparable<Suport> {

	String code;
	public Suport(String s) {
	this.code=s;	
	}
	
	@Override
	public int compareTo(Suport s) {
		
		return this.code.compareTo(s.code);
	}

}
