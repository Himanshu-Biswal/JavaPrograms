package Array2D;

public class Array2D_16 {
 public static void main(String[] args) {
	 int n=5;
//	 int a[][]=new int[n][n];
	 
	 for(int i=0;i<n;i++) {
		 for(int j=0;j<n;j++) {
			 if(i==0 || j==0 || i==n-1 || j==n-1)System.out.print(1+" ");
			 else if(i==2 && j==2) System.out.print(3+" ");
			 else System.out.print(2+" ");
		 }
		 System.out.println();
	 }
}
}
