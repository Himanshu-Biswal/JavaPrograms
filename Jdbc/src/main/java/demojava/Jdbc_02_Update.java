package demojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_02_Update {
	private static String url="jdbc:postgresql://localhost:5432/JdbcDemo";
	private static String user="postgres";
	private static String pswd="Himanshu@123";
 public static void main(String[] args) {
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");
		Connection conn = DriverManager.getConnection(url,user,pswd);
		System.out.println(conn);
		
		Statement stm = conn.createStatement();
		System.out.println(stm);
		String sql = "update college set sname='babul' where id=101";
		stm.execute(sql);
		conn.close();
	} 
	
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
