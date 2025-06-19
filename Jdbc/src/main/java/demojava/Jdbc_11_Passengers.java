package demojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class Jdbc_11_Passengers{
	private static String url="jdbc:postgresql://localhost:5432/Travel Details";
	private static String user="postgres";
	private static String pswd="Himanshu@123";
 public static void main(String[] args) {
	 try {
		 String Payment="";
		 //Step-1
		Class.forName("org.postgresql.Driver");
		
		//Step-2
		Connection con = DriverManager.getConnection(url,user,pswd);
		con.setAutoCommit(false);
		String sql="insert into passengers values(?,?,?,?,?)";
		//Step-3
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1,103);
		pstm.setString(2,"slu");
		pstm.setString(3,"BLR");
		pstm.setString(4,"BBSR");
		pstm.setInt(5,22);
		//Step-4
       pstm.executeUpdate();
       
       PreparedStatement pstm1 = con.prepareStatement("insert into ticket values(?,?,?)");
		pstm1.setInt(1,123);
		pstm1.setString(2,"07:00");
		pstm1.setInt(3,7700);
		pstm1.executeUpdate();
		
		Savepoint savePointAfterTicket=con.setSavepoint();
		
		 PreparedStatement pstm2 = con.prepareStatement("insert into payment values(?,?,?)");
			pstm2.setInt(1,133);
			pstm2.setString(2,"slu");
			pstm2.setInt(3,7700);
			pstm2.executeUpdate();
			
			if(Payment.isEmpty()) {
				con.commit();
			}
			else {
				con.rollback(savePointAfterTicket);
			}
		//Step-5
		con.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
