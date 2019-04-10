package com.candidjava;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

public class DatabaseConnectionFactory {
	
	private static String dbURL="jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbUser="system";
	private static String dbPassword="dahshad123";
	
	public static Connection createConnection()
	{
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Calcutta");
		
        TimeZone.setDefault(timeZone);
Connection con=null;
try{
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
}
catch(ClassNotFoundException ex) {
System.out.println("Error: unable to load driver class!");
System.exit(1);
}
System.out.println("Connecting to a selected database...");

con = DriverManager.getConnection(dbURL,dbUser,dbPassword);

System.out.println("Connected database successfully...");
		   }
		  catch(SQLException sqe){ System.out.println("Error: While Creating connection to database");sqe.printStackTrace();}
		return con;
	}

}


