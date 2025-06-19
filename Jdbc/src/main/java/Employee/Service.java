package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Service {
	private static String url="jdbc:postgresql://localhost:5432/EmployeeManagment";
	private static String user="postgres";
	private static String pswd="Himanshu@123";
	private static Scanner sc = new Scanner(System.in);
	static Source s;
	private static Connection con;
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
			 con = DriverManager.getConnection(url,user,pswd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
  public void addDetails(){	
	  Source s = new Source();
	  System.out.println("Enter How Many Employee Data You Want To add");
	  int t=sc.nextInt();
	  for(int i=1;i<=t;i++) {
		  System.out.println("Enter emp Id");
		  int id=sc.nextInt();
		  System.out.println("Enter emp Name");
		  String name=sc.next();
		  System.out.println("Enter emp Age");
		  int age=sc.nextInt();
		  System.out.println("Enter emp Salary");
		  int sal=sc.nextInt();
		  String sql="insert into employee values(?,?,?,?)";
			 s.setId(id);
			 s.setName(name);
			 s.setAge(age);
			 s.setSal(sal);
			try {
				PreparedStatement pstm = con.prepareStatement(sql);
				pstm.setInt(1,s.getId());
				pstm.setString(2,s.getName());
				pstm.setInt(3,s.getAge());
				pstm.setInt(4, s.getSal());
				pstm.executeUpdate();
				System.out.println(t+" Data Added !!!!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
	  }	  
  }
  public void deleteDetails() {
	  System.out.println("Enter emp Id");
	  int id=sc.nextInt();
	  String sql="delete from employee where id=?";
	  
	 try {
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1, id);
		pstm.execute();
		System.out.println(id+" Emp Data Deleted !!!");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
public void updateDetails() {
	System.out.println("Enter emp Id");
	  int id=sc.nextInt();
//	  System.out.println("Enter Emp New Name");
//	  String name=sc.next();
	  String sql="update employee set name='Banti' where id=?";
	  try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, id);
//			pstm.setString(2, name);
			pstm.execute();
			System.out.println(id+" Emp Data Updated !!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
public void fetchDetails() {
	String sql="select * from employee";
	try {
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			int age=rs.getInt(3);
			int sal=rs.getInt(4);
			System.out.println("  ");
			System.out.println(id+":"+name+":"+age+":"+sal);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
