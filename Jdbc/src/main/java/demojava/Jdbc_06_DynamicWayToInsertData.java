 package demojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_06_DynamicWayToInsertData {
	private static String url="jdbc:postgresql://localhost:5432/JdbcDemo";
	private static String user="postgres";
	private static String pswd="Himanshu@123";
 public static void main(String[] args) {
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");
		Connection conn = DriverManager.getConnection(url,user,pswd);
		System.out.println(conn);
		
		String sql="insert into college values(?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		
		pstm.setInt(1, 105);
		pstm.setString(2,"Sudha");
		pstm.setInt(3, 22);
        pstm.execute();		
		conn.close();
	} 
	
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}

