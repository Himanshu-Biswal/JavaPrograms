package Recursion;

public class PerfectNoInrange {
  
	
	static int per(int n,int i,int sum) {
		if(i==0) return sum;
		if(n%i==0)  sum=sum+i;
		return per(n,i-1,sum);
		
	}
	
//	static boolean per(int n,int i,int sum) {
//		if(i==0) return n==sum;
//		if(n%i==0)  sum=sum+i;
//		return per(n,i-1,sum);
//		
//	}
//	
	static void display(int st,int end) {
		if(st>end) return;
		int s=0,i=st/2;
		if(per(st, i, s)==st) System.out.println(st); 
		
		display(st+1, end);
	}
	
	public static void main(String[] args) {
		
		 display(1, 10000);
	}
}
