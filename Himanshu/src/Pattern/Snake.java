package Pattern;

public class Snake {
 public static void main(String[] args) {
	
	 int n=5;
	 
	 for(int i=1;i<=n;i++) {
		 if(i%2!=0) {
//			 int k=(i-1)*n+1;
			int k=(i*n)-4;
		 for(int j=1;j<=n;j++) {
			System.out.print(k+"\t");
			k++;
		 }
		}
		 else {
			 int s=i*n;
			 for(int j=1;j<=n;j++) {
				 System.out.print(s+"\t");
				 s--;
			 }
		 }
		 System.out.println();
	 }
}
}




//if(i==1 || j==1 || j==n ||i==n ||i==j || i+j==n+1)
// if(i==j || i+j==n+1)
 
// k=k+1;
	// System.out.print(k+" ");
	// k=k++;
 
// else   System.out.print(" ");