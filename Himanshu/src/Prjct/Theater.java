package Prjct;

public class Theater {
 private static Theater t;
  static int seats=100;
 
 private Theater() {
	 
 }
 
 public static Theater getInstance() {
	 if(t==null) {
		 t=new Theater();
		 return t;
	 }
	 
	 else return t;
 }
 
 public void display(int n) {
	 if(n>seats) {
		 System.out.println(n+"seats not available");
		 System.out.println(seats+"seats not available");
//		 System.out.println("-------------------------------");
	 }
	 
	 else {
		 seats=seats-n;
		 System.out.println(n+"seats are booked");
	 }
 }
 
}
