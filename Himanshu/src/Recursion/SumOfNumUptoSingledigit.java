package Recursion;

public class SumOfNumUptoSingledigit {
	 
	static int sm(int n) {
			if(n==0 || n<=9) return n;
			int a=n%10+sm(n/10);
			return sm(a);
//			return a;
		}
		public static void main(String[] args) {
			System.out.println(sm(1230));
		}
	}

