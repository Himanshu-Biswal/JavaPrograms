package Pratice;



public class Number {
	static void m1(int a,int b) {
		System.out.println(a+b);
	}
	
	static void m1(int a,double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		m1(3,4);
		m1(3, 4.7);
	}
}
