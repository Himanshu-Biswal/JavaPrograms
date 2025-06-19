package Recursion;

public class ArmstrongInRange {
	
	public static int count(int n) {
		if(n==0) return 0;
		return 1+count(n/10);
	}
	static int pow(int b,int p,int res) { //  2,2
		if(p==0) return res;
		if(b==0) return 0;
		res=res*b;
		return pow(b, p-1, res);
	}
	public static boolean isArm(int n , int m , int sum) {
		if(n==0) return m==sum;
//		sum = sum + (int)(Math.pow(n%10, count(m)));
		sum = sum + pow(n%10,count(m),1);
		return isArm(n/10, m, sum);
	}
	static void range(int st,int end) {
		if(st>end)return;
		else {
			if(isArm(st,st,0)) System.out.println(st);
		}
		range(st+1, end);
	}
	
	public static void main(String[] args) {
		range(1, 1000);
//		System.out.println(isArm(153, 153, 0));
	}
}
