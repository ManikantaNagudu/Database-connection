package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlConnection {

public static void main(String[] args) throws Exception {
	
	
	
/*//URLS
//https://social.msdn.microsoft.com/Forums/sqlserver/en-US/80aa335c-eddd-4f65-86d5-4628372bec82/commicrosoftsqlserverjdbcsqlserverexception-the-connection-to-the-host-joe-62cb72961d9-named?forum=sqldataaccess
//http://artoftesting.com/automationTesting/sqlServerAutomation.html*/
	
//Loading the required JDBC Driver class
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
				
//Creating a connection to the database
Connection conn = DriverManager.getConnection("jdbc:sqlserver://MHSI-W10-SUP03:1433;databaseName=TestDB;user=sa;password=mhsi@2015");

//Executing SQL query and fetching the result
Statement st = conn.createStatement();
String sqlStr = "select * from Details";
ResultSet rs = st.executeQuery(sqlStr);
//Fetching data from result set
while (rs.next()) {
System.out.println(rs.getString("name"));
System.out.println(rs.getString("name") + " " + rs.getString("address"));

/*System.out.println("Name: " + rs.getString("name") );
System.out.println("Address: " + rs.getString("address")); 

System.out.println("Student: " + rs.getString("StudentLastName") + ", " + rs.getString("StudentFirstName"));
System.out.println("Teacher: " + rs.getString("TeacherLastName") + ", " + rs.getString("TeacherFirstName"));*/

}
}

}
