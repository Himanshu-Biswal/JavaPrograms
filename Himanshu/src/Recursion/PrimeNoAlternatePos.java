package Recursion;

public class PrimeNoAlternatePos {
	static boolean isPrime(int n , int i) {
		if(i==1) return true;
		if( n<=1||n%i==0) return false;
		return isPrime(n, i-1);
	}
	
	static void display(int st,int end,int c) {
		if(st>end) return;
		
		if(isPrime(st, st/2)) {
			c++;
			if(c%2==0)
			System.out.println(st); 
		
		}
		
		display(st+1, end,c);
	}
public static void main(String[] args) {
	display(1, 100,0);
//	int n=1;
//          System.out.println(isPrime(n, n/2));
 }
}
