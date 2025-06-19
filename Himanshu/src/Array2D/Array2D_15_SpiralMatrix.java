package Array2D;

public class Array2D_15_SpiralMatrix {
 public static void main(String[] args) {
	int n=5;
	int a[][]=new int[n][n];
	int row=0,col=-1;
	char dir='r';
	for(int i=1;i<=n*n;i++) {
		switch(dir) {
		case 'r':{
		  col++;
		  a[row][col]=i;
		  if(col==a.length-1 || a[row][col+1]!=0)
			  dir='d';
		} break;
		
		case 'd':{
			  row++;
			  a[row][col]=i;
			  if(row==a.length-1 || a[row+1][col]!=0)
				  dir='l';
			} break;
			
		case 'l':{
			  col--;
			  a[row][col]=i;
			  if(col==0 || a[row][col-1]!=0)
				  dir='u';
			} break;
			
		case 'u':{
			  row--;
			  a[row][col]=i;
			  if( a[row-1][col]!=0)
				  dir='r';
			} break;
	}
}
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
//			if(i==0)System.out.print("");
			System.out.print(a[i][j]+"   ");
		}
		System.out.println();
	}
}
}