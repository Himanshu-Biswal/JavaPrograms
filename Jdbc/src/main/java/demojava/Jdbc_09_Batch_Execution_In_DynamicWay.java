package demojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_09_Batch_Execution_In_DynamicWay {
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
		
		pstm.setInt(1, 106);
		pstm.setString(2,"Salu");
		pstm.setInt(3, 22);
        pstm.addBatch();
        
        pstm.setInt(1, 107);
		pstm.setString(2,"Nira");
		pstm.setInt(3, 25);
        pstm.addBatch();
        
        pstm.executeBatch();
        System.out.println("Data Loaded");
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
