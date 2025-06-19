package Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Servlet_15_service {
	private static Connection con;
	private static final String url = "jdbc:postgresql://localhost:5432/EmployeeManagment?user=postgres&password=Himanshu@123";
//	private static final String user = "postgres";
//	private static final String pass = "123";

	static {

		try {
			Class.forName("org.postgresql.Driver");

			con = DriverManager.getConnection(url);

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public int save(Servlet_14_Student s) throws SQLException {
		 if (con == null) {
	            System.err.println("Database connection is not established.");
	            return 0;
	        }
		int id = s.getId();
		String name  =s.getName();
		int age = s.getAge();
		String gender = s.getGender();
		String mail=s.getMail();
		String pswd = s.getPswd();
		String sql ="insert into student values(?,?,?,?,?,?)"; 
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1, id);
		pstm.setString(2, name);
		pstm.setInt(3, age);
		pstm.setString(4, gender);
		pstm.setString(5, mail);
		pstm.setString(6, pswd);
		
		int res = pstm.executeUpdate();
		return res;
		
	}
	
	public boolean check(String id, String pswd) throws SQLException {
	    String sql = "SELECT * FROM student WHERE id = ? AND pswd = ?";
	    try (PreparedStatement pstm = con.prepareStatement(sql)) {
	        int sid = Integer.parseInt(id);
	        System.out.println(sid + "\t" + pswd);
	        pstm.setInt(1, sid);
	        pstm.setString(2, pswd);
	        
	        try (ResultSet rs = pstm.executeQuery()) {
	            return rs.next(); // true if a match is found
	        }
	    }
	}

}
