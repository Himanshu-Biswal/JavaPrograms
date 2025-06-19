package Pratice;

public class Sal {
	public static boolean isSpy(int n,int sum,int prod) {
    if(n==0) return sum==prod;
      int r=n%10;
      sum=sum+r;
      prod=prod*r;
      return isSpy(n/10,sum,prod);
	}
	
	public static void range(int st,int end) {
		if(st>end) return;
		
		if(isSpy(st,0,1)) {
			System.out.println(st);
			}
		range(st+1,end);
	}
 public static void main(String[] args) {
//	int n=123;
//	System.out.println(isSpy(n,0,1));
//	 if(n==isPre(n, n/2, 0)) System.out.println("ok");
//	 else System.out.println("no");
	 range(1,200);
}
}
