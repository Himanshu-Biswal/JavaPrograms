package demojava;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_04_Select {
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
		String sql = "select * from college";
		ResultSet rs = stm.executeQuery(sql);
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			BigDecimal age=rs.getBigDecimal(3);
			System.out.println(" ");
			
			
			System.out.println(id+":"+name+":"+":"+age);
			System.out.println("=====================");
		}
		conn.close();
	} 
	
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}

