package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_ResultSet {
	
	public static void main(String[] args) throws SQLException{
		
		String username = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@18.212.54.99:1521:xe";
		
		// Connection step
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connected successfully.");
		
		// Statement step
		Statement statement = connection.createStatement();
		System.out.println("Statement is created.");
		
		//ResultSet step
		ResultSet result = statement.executeQuery("select * from employees");
		System.out.println("Result set is completed.");
		
	}

}
