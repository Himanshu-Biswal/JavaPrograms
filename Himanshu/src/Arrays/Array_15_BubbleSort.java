package Arrays;

import java.util.Arrays;

public class Array_15_BubbleSort {
	
	static void sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp =a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
 public static void main(String[] args) {
	int a[]= {8,6,4,6,3,2,1,8,0};
	sort(a);
	System.out.println(Arrays.toString(a));
}
}
