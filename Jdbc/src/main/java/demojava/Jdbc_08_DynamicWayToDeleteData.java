package demojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_08_DynamicWayToDeleteData {
	private static String url="jdbc:postgresql://localhost:5432/JdbcDemo";
	private static String user="postgres";
	private static String pswd="Himanshu@123";
  public static void main(String[] args) {
	  try {
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pswd);
		System.out.println(con);
		
		String sql="delete from college where id=?";
		PreparedStatement pstm = con.prepareStatement(sql);
		
		pstm.setInt(1, 103);
		pstm.execute();
		
		con.close();
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
 }
} 

