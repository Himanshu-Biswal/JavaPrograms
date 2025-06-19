package Pattern;

public class Pyramid {
 public static void main(String[] args) {
	 int n=5;
	 int spc=n-1;
	 int st=1;
	 
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=spc;j++)  System.out.print(" "); 
		 
		 for(int j=1;j<=st;j++) 
		
		 {if(j==1||i==n||j==st)
			 System.out.print("*");
		 else
			 System.out.print(" ");
		 }
		 
		
		 
		spc--;
		st=st+2;
		  System.out.println();
	 }
}
}
