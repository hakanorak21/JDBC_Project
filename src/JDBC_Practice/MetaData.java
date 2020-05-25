package JDBC_Practice;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import Utility.DBUtility;

public class MetaData {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("User: " + DBUtility.metadata.getUserName());
		System.out.println("Database Type: " + DBUtility.metadata.getDatabaseProductName());
		System.out.println("Database Version: " + DBUtility.metadata.getDatabaseProductVersion());
		System.out.println("Driver Name: " + DBUtility.metadata.getDriverName());
		System.out.println("Driver Version: " + DBUtility.metadata.getDriverVersion());
		System.out.println("=================================");
		
		ResultSet rs = DBUtility.getResultSet("select * from employees");
		ResultSetMetaData resultData = rs.getMetaData();
		
		System.out.println( resultData.getColumnCount());
		System.out.println( resultData.getColumnName(5) );
		
		System.out.println("=================================");
//		// Printing column names
//		for (int i=1; i <= resultData.getColumnCount(); i++) {
//			System.out.println(resultData.getColumnName(i));
//		}
		
		
	}

}
