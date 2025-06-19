package Employee;

import java.sql.SQLException;
import java.util.Scanner;
public class Driver {
 public static void main(String[] args) throws SQLException {
	 Service s = new Service();
	 System.out.println("WELCOME TO EMPLOYEE MANAGMENT APPLICATION");
	 System.out.println("Enter 1 for Add Employee Data");
	 System.out.println("Enter 2 for Update Employee Data");
	 System.out.println("Enter 3 for Fetch Employee Data");
	 System.out.println("Enter 4 for Delete Employee Data");
	 System.out.println("Enter 5 for Exit From Employee Managment");
	 
	 Scanner sc = new Scanner(System.in);
	 int choice=sc.nextInt();
	 
	 switch (choice) {
	    case 1 : s.addDetails(); break;
	    case 2 : s.updateDetails(); break;
	    case 3 : s.fetchDetails(); break;
	    case 4 : s.deleteDetails();  break;
	    default : System.out.println("Thank You For Visit !");
	}


}
}
