package Arrays;
 import java.util.Arrays;
public class Array_09_shift0ToRight {
	public static void main(String[] args) {
		int a[]= {3,0,1,2,0,5,0};
		int b[] = new int[a.length];
	    int j=0;
	    
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]!=0) {
	    		b[j]=a[i];
	    		j++;
	    	}
	    }
//	    for(int n:b) {
//	    	System.out.print(n+" ");
//	    }
	    System.out.println(Arrays.toString(b));
}
}