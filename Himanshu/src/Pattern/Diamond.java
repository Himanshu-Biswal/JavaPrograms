package Pattern;
// import java.util.Scanner;
public class Diamond {
 public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	 int n =7;
	 int space=n-1;
	 int st=1;
	 for(int i=1;i<=n;i++) {
		 
		  for(int j=1;j<=space;j++) {
			  System.out.print(" ");
		  }
		  
		  for(int j=1;j<=st;j++) {
			  System.out.print("*");
		  }
		  
		  if(i<=n/2) {
			  space--;
			  st=st+2;
		  }
		  else {
			  space++;
			  st=st-2;
		  }
		  System.out.println();
	 }
}
}
