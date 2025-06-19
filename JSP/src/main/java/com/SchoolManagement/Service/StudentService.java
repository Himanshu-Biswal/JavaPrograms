package com.SchoolManagement.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.SchoolManagement.Entity.Student;


public class StudentService  {
	private static final String url = "jdbc:postgresql://localhost:5432/studentmanagement?user=postgres&password=Himanshu@123";
	private static Connection con;
	
	static {

		try {
			Class.forName("org.postgresql.Driver");

			con = DriverManager.getConnection(url);

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public int save(Student s) throws SQLException {
		 if (con == null) {
	            System.err.println("Database connection is not established.");
	            return 0;
	        }
		int id = s.getId();
		String name  =s.getName();
		int age = s.getAge();
		String sql ="insert into student values(?,?,?)"; 
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1, id);
		pstm.setString(2, name);
		pstm.setInt(3, age);
		
		int res = pstm.executeUpdate();
		return res;
		
	}
	
	 // ✅ Method to fetch all student records
    public List<Student> fetchAll() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM student";
        Statement stmt;
		try {
			stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery(sql);
			 while (rs.next()) {
		            Student s = new Student();
		            s.setId(rs.getInt("id"));
		            s.setName(rs.getString("name"));
		            s.setAge(rs.getInt("age"));
		            students.add(s);
		        }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return students;
    }
    
    public int edit(Student s) {
    	String sql = "Update student set name=? , age=? where id=?";
    	int res=0;
    	try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, s.getName());
			pstm.setInt(2, s.getAge());
			pstm.setInt(3, s.getId());
			res=pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return res;
    }
    
    public int delete(Student s) {
    	int res=0;
    	String sql = "Delete from student where id=?";
    	try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1,s.getId());
			res=pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return res;
    }
}
