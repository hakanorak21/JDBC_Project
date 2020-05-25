package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdate {

	public static void main(String[] args) throws SQLException {
		
		String username = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@18.212.54.99:1521:xe";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		
		// Execute Update
		statement.executeUpdate("update developers set name = 'Madina' where name = 'Muhtar'");
		
		ResultSet result = statement.executeQuery("select * from developers");
		
		int count = 1;
		while(result.next()) {
			String name = result.getString("name");
			System.out.println(count + ". "+ name);
			count++;
		}
		
	}

}
