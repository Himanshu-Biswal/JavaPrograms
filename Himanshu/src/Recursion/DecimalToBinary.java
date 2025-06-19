package Recursion;

public class DecimalToBinary {
 static int dtb(int dec,int i,int bin) {
	 if(dec==0) return bin;
	 int r=dec%2;
	 bin=bin+(i*r);
	 return dtb(dec/2, i*10, bin);
 }
 
 public static void main(String[] args) {
	System.out.println(dtb(7, 1, 0));
}
}
