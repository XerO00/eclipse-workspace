package com.core.java.concept.trywithresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Main started");
		File f = new File("test");
		try(FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr)){
		/*	
	       int i= 0;
	       while ((i=fr.read())!= -1 ) {
	    	//   System.out.println(i=fr.read());
	    	   System.out.print((char)i);
	*/
			 System.out.print(br.readLine());	
		
		}	
	}
}
