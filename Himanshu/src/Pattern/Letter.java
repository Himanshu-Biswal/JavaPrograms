package Pattern;

public class Letter {
 public static void main(String[] args) {
	
	 int n=5;
	 
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=n;j++) {
			 if((i==1 && i+j>=3) || (j==2 && i+j<=n+1) ||(i==4 && (j==3 || j==4 || j==2)) ||(i==3 && j==4) ||(j==5 && i>n/2)) {
				 System.out.print("*");
			 }
			 else System.out.print(" ");
		 }
		 System.out.println();
	 }
}
}
