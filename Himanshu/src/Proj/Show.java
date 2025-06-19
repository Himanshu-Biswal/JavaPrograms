package Proj;

import java.util.Scanner;

public class Show {
 public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the Details: ");
//	String s=sc.next();
//	int age=sc.nextInt();
//	String qa=sc.next();
//	int mark=sc.nextInt();
//	int y=sc.nextInt();
	System.out.println(" 1.MCA \n 2.BSC \n 3.PLUSTWO \n 4.TENTH");
	int n=sc.nextInt();
	Student st=new Student("Himanshu", 24,new Qualification());
	st.displayDetails(n);
}
}
