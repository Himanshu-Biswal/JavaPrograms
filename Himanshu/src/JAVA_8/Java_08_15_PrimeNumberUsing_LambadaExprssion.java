package JAVA_8;

interface In{
	public boolean isPrime(int n);
}
public class Java_08_15_PrimeNumberUsing_LambadaExprssion {
 public static void main(String[] args) {
	In i=n->{
		if(n<2) return false;
		for(int j=2;j<=n/2;j++) {
			if(n%j==0)return false;
		}
		return true;
	};
	System.out.println(i.isPrime(2));
}
}
