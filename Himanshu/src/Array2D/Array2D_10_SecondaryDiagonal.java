package Array2D;

public class Array2D_10_SecondaryDiagonal {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i+j==a.length-1) {
					sum+=a[i][j];
					System.out.print(a[i][j]);
					if(j>0) {
						System.out.print("+");
					}
				}
			}
		}
		System.out.println("="+sum);
	}
}
