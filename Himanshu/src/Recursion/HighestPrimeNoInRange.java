package Recursion;

public class HighestPrimeNoInRange {
	static boolean isPrime(int n , int i) {
		if(i==1) return true;
		if(n<=1 || n%i==0) return false;
		return isPrime(n, i-1);
	}
	
	static void display(int st,int end,int c) {
		if(st>end) return;
		
		if(isPrime(end, end/2)) {
			c++;
			if(c==1) {
			System.out.println(end); 
			return;
		}
		}
		
		display(st, end-1,c);
	}
public static void main(String[] args) {
	display(1, 100,0);
          
 }
}
