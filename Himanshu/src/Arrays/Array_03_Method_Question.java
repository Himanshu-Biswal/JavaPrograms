package Arrays;

import java.util.Arrays;

public class Array_03_Method_Question {
	
	public static void m1(int[] a) {
		a[1]++;   //a[1]=2;
	}
	
 public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	m1(a);
	System.out.println(Arrays.toString(a));
}
}
