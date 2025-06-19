package Recursion;

public class Prime_Palindrome {
	static boolean isPrime(int n,int i) {
		if(i==1) return true;
		if(n<2 || n%i==0) return false;
		return isPrime(n, i-1);
	}
	static boolean isPal(int n,int m,int rev) {
		if(n==0) return m==rev;
		rev=(rev*10)+n%10;
		return isPal(n/10, m, rev);
	}
	static void range(int st,int end) {
		if(st>end) return;
		else {
			if(isPrime(st, st/2)) {
				 if(isPal(st, st, 0)) {
					 System.out.println(st+" is a Prime Palindrome .");
				 }
			 }
		}
		range(st+1, end);
	}
 public static void main(String[] args) {
//	 int n=11; 
//	 if(isPrime(n, n/2)) {
//		 if(isPal(n, n, 0)) {
//			 System.out.println(n+" is a Prime Palindrome .");
//		 }
//	 }
//	 else System.out.println(n+" is not Prime Palindrome .");
	 range(1, 1000);
}
}


