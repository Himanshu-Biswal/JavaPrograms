package Recursion;

public class fibbonacciInRange {
 public static void main(String[] args) {
//	 int n=15;
//	 display(n);
//	 System.out.println(fibo(0, 1, 0, 10));
	 fibo(0, 1, 0, 10);
}
// static void display(int numOfVal) {
//	 fibo(0,1,1,numOfVal);
// }
 static int fibo(int a,int b,int count,int n) {
	 if(count>n) return n ;
	  System.out.println(a);
	return fibo(b,a+b,count+1,n);
 }
}
