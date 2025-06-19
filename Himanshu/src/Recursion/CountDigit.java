package Recursion;

public class CountDigit {
	static int m1(int n){
		if(n==0) return 0;
		return 1+m1(n/10);
	}
	
	public static void main(String[] args) {
        int n=123456789;
		System.out.println(m1(n));
	}
}
