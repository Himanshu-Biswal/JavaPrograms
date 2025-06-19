package Arrays;

import java.util.Arrays;

public class Array_16_InsertionsSort {
	static void sort(int a[]) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];  
			int j=i-1;  
			
			while(j>=0 && a[j]>key) { 
				a[j+1]=a[j]; // 
				j--;
			}
			a[j+1]=key;
		}
	}
 public static void main(String[] args) {
	int a[]= {1,8,6,4,3,2,0};
	sort(a);
	System.out.println(Arrays.toString(a));
}
}
