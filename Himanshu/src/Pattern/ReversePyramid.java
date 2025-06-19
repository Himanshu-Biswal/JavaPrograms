package Pattern;

public class ReversePyramid {
 public static void main(String[] args) {
	
	 int n=5;
	 int spc=n-1;
	 int st=n*2-1;
	 
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=spc;j++)  System.out.print(" "); 
		 
		 for(int k=1;k<=st;k++)   System.out.print("*");
		 
		 System.out.println();
		 
		 spc++;
		 st-=2;	 
		 
	 }
}
}
