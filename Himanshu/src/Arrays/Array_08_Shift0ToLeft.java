package Arrays;

import java.util.Arrays;

public class Array_08_Shift0ToLeft {
 public static void main(String[] args) {
	int a[]= {3,0,1,2,0,5,0};
	int b[] = new int[a.length];
    int j=b.length-1;
    
    for(int i=a.length-1;i>=0;i--) {
    	if(a[i]!=0) {
    		b[j]=a[i];
    		j--;
    	}
    }
    System.out.println(Arrays.toString(b));
}
}
