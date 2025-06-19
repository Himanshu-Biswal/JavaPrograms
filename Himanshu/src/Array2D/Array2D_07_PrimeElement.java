package Array2D;

public class Array2D_07_PrimeElement {
	
	static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(isPrime(a[i][j])) {
					System.out.println(a[i][j]);
				}
			}
		}
		
	}
}
