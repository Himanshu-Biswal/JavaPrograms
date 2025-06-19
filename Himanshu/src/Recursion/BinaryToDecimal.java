package Recursion;

public class BinaryToDecimal {
	static int btd(int n,int i,int dec) {
		if(n==0) return dec;
		int r=n%10;
		dec=dec+(i*r);
		return btd(n/10, i*2, dec);
	}
 public static void main(String[] args) {
	 System.out.println(btd(111, 1, 0));
}
}
