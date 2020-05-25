package JDBC_Practice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utility.DBUtility;

public class ResultSet_List {
	
public static void main(String[] args) throws SQLException {
        
        ResultSet result = DBUtility.getResultSet("Select * from Employees");
        
        List<String> EmployeeNames = new ArrayList<>();
        
        while(result.next()) {
            String firstName = result.getString("first_name");
            String lastName = result.getString("last_name");      
            
            String fullName = firstName+" "+lastName;
            
            EmployeeNames.add(fullName);     
        }
        System.out.println( EmployeeNames.contains("Steven King") );
        
        System.out.println(EmployeeNames);
        
        DBUtility.tearDown();
               
    }

}
