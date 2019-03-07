package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLTop10Rows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Loading the required JDBC Driver class
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
						
		//Creating a connection to the database
		Connection conn1 = DriverManager.getConnection("jdbc:sqlserver://MHSI-W10-SUP03:1433;databaseName=TestDB;user=sa;password=mhsi@2015");
		
		// Declare the JDBC objects.
	      Connection con = null;
	      Statement stmt = null;
	      ResultSet rs = null;
		 // Create and execute an SQL statement that returns some data.
        String SQL = "SELECT TOP 10 * FROM Details";
        stmt = conn1.createStatement();
        rs = stmt.executeQuery(SQL);
        
        // Iterate through the data in the result set and display it.
        while (rs.next()) {
           System.out.println(rs.getString(1) + " " + rs.getString(2));
        }
     }
	}


