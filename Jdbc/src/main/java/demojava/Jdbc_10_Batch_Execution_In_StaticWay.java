package demojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_10_Batch_Execution_In_StaticWay {
//	private static String url="jdbc:postgresql://localhost:5432/JdbcDemo";
//	private static String user="postgres";
//	private static String pswd="Himanshu@123";
	
	private static String url = "jdbc:postgresql://localhost:5432/JdbcDemo?user=postgres&password=Himanshu@123";

 public static void main(String[] args) {
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");
		Connection conn = DriverManager.getConnection(url);
		System.out.println(conn);
		
		@SuppressWarnings("unused")
		String sql="insert into college values(?,?,?)";
	    Statement stm = conn.createStatement();
	    stm.addBatch("update college set sname='Madhu' where id=102");
	    
	    stm.executeBatch();
	   
	    System.out.println("Data Updated");
		//Step-5
		conn.close();
	} 
	
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
