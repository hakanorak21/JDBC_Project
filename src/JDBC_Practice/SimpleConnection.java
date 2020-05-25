package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnection {
	
	public static void main(String[] args) throws SQLException {
		
		String username = "hr";
		String password = "hr";
		//DNS or IP after thin:@, followed by :1521:xe
		String url = "jdbc:oracle:thin:@18.212.54.99:1521:xe";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connected successfully");
		
	}
	
}
