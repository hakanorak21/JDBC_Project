package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class PrintingResult {

	public static void main(String[] args) throws SQLException {
		String username = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@52.23.167.204:1521:xe";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from employees");
		
		
//		int count = 1;
//		while(result.next()) {
//			String firstName = result.getString("first_name");
//			System.out.println(count + ". "+ firstName);
//			count++;
//		}
		
		
//		//Now, with column number
//		int count = 1;
//		while(result.next()) {
//			String firstName = result.getString(2);
//			System.out.println(count + ". "+ firstName);
//			count++;
//		}
		
		
//		//Now, first and last name
//		int count = 1;
//		while(result.next()) {
//			String firstName = result.getString(2);
//			String lastName = result.getString("last_name");
//			System.out.println(count + ". "+ firstName + " " + lastName);
//			count++;
//		}
		
		
//		//Now, with salary
//		int count = 1;
//		while(result.next()) {
//			String firstName = result.getString(2);
//			String lastName = result.getString("last_name");
//			int salary = result.getInt("salary");
//			System.out.println(count + ". "+ firstName + " " + lastName + " $" + salary);
//			count++;
//		}
		
		
		//Date data
		int count = 1;
		while(result.next()) {
			String firstName = result.getString(2);
			String lastName = result.getString("last_name");
			Date hireDate = result.getDate("hire_date");
			System.out.println(count + ". "+ firstName + " " + lastName + " " + hireDate);
			count++;
		}
		
	}

}
