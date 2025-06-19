package Arrays;

import java.util.Arrays;


public class AA {
	static void merge(int a[],int b[],int c[]) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) c[k++]=a[i++];
			else c[k++]=b[j++];
		}
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];
	}
	static void sort(int a[]) {
         if(a.length==1) return;
        int l[]=new int[a.length/2];
        int r[]=new int[a.length-l.length];
        for(int i=0;i<l.length;i++) {
        	l[i]=a[i];
        }
        for(int i=0;i<r.length;i++) {
        	r[i]=a[i+l.length];
        }
        sort(l);
        sort(r);
        merge(l, r,a);
	}
 public static void main(String[] args) {
	int a[]= {5,4,3,2,1};
//	 int a[]= {1,2,3,4,5};
	sort(a);
	System.out.println(Arrays.toString(a));
}
}
