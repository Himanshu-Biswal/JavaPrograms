package Arrays;

public class Array_12_BinarySearch {
 static int search(int a[],int key) {
	 int st=0,end=a.length-1;
	 
	 while(st<=end) {
		 int mid=(st+end)/2;
		 if(key==a[mid]) return mid;
		 else if(key<a[mid]) end=mid-1;
		 else if(key>a[mid]) st=mid+1;
	 }
	 return -1;
 }
 public static void main(String[] args) {
	 int a[]= {1,2,3,4,5,5,6,7,8};
		System.out.println(search(a,5));
}
}
