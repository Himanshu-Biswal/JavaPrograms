package demojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_01_InsertData {
	private static String url="jdbc:postgresql://localhost:5432/JdbcDemo";
	private static String user="postgres";
	private static String pswd="Himanshu@123";
 public static void main(String[] args) {
	try {
		//Step-1
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");
		//Step-2
		Connection conn = DriverManager.getConnection(url,user,pswd);
		System.out.println(conn);
		//Step-3
		Statement stm = conn.createStatement();
		System.out.println(stm);
		String sql = "insert into college values(103,'Babul',24)";
		//Step-4
		stm.execute(sql);
		//Step-5
		conn.close();
	} 
	
	catch (ClassNotFoundException e) {
//		e.printStackTrace();
System.out.println("Exception Occure Due To Invalid Location");
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
