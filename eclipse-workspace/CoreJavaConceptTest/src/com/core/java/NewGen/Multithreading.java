package com.core.java.NewGen;

public class Multithreading extends Thread{

	int code= 9;
	@Override
	public void run() {
	  this.code=7;
	}
	public static void main(String[] args) {
		
		Multithreading m= new Multithreading();
		m.start();
		
		for (int i = 0; i <5; i++) {
			System.out.println(m.code);
		}
	}

}
