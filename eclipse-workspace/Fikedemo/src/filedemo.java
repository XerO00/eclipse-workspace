
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TimeZone;

import javax.swing.text.Document;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;



public class filedemo {


		public static void main(String[] args) throws SAXException,ParserConfigurationException,IOException, URISyntaxException
		{
			
				    Document dom=null;
				    File quizFile=null;
				    
			        quizFile=new File("/home/prasanna/Quizzes/java-quiz-1.xml");
			        System.out.println("Quiz File Absolute Path "+quizFile.getAbsolutePath());
		}
}


