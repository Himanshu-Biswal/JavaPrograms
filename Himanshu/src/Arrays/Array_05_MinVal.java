package Arrays;

public class Array_05_MinVal {
	 public static void main(String[] args) {
			int a[]= {1,0,-1,2,4,7,8,9,10};
			int min=a[0];
			
			for(int n:a) {
				if(n<min) min=n;
			}
			System.out.println(min);
		}
}
