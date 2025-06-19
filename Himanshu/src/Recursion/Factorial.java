package Recursion;

public class Factorial {
 public static void main(String[] args) {
	int res=fact(-6);
	System.out.println(res);
}
 
 public static int fact(int n) {
	if(n<=1) return 1;
	else return n*fact(n-1);
	 
 }
}
