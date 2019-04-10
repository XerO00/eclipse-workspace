package com.core.java.NewGen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable{

	transient int x = 5;
	public static void main(String[] args) {

		SerializationDemo tester1= new SerializationDemo();
		try { 
		   ObjectOutputStream  os = new ObjectOutputStream(new FileOutputStream("test.txt"));
		   os.writeObject(tester1);
		   os.close();
			
		   System.out.println("First "+  ++tester1.x + " ");
		   
		   ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.txt"));
		   SerializationDemo tester2 = (SerializationDemo) is.readObject();
		   is.close();
		   System.out.println("Sec"		 +tester2.x);
		   
		   
		   
		}
		catch (Exception e) {
			System.out.println("aa");
		}
		
	}

}
