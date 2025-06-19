package Array2D;

public class AA {
	static void pascal(int a[][]) {
		for(int i=0;i<a.length;i++) {
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++) {
				if(j==0 || i==j)a[i][j]=1;
				else a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}
	}
 public static void main(String[] args) {
	 int n=5;
	 int a[][]=new int [n][];
//	 int st=1,sp=n-1;
	 pascal(a);
	 for(int i=0;i<a.length;i++) {
		 for(int j=1;j<=n-i;j++) System.out.print(" ");
		 for(int j=0;j<a[i].length;j++) {
			 System.out.print((a[i][j]+" "));
		 }
		 System.out.println();
	 }
//	 for(int i=0;i<n;i++) {
//		 for(int j=1;j<=sp;j++) System.out.print(" ");
//		 for(int j=0;j<st;j++) System.out.print(a[i][j]+" ");
//		 sp--;
//		 st++;
//		 System.out.println();
//	 }
	} 
}
