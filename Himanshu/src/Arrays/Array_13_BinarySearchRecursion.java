package Arrays;

public class Array_13_BinarySearchRecursion {
	static int search(int a[],int key,int st,int end) {
		 
		 if(st>end) return -1;
		 int mid=(st+end)/2;
		  if(key==a[mid]) return mid;
			 else if(key<a[mid]) return search(a, key,st,mid-1);
			 else  return search(a, key,mid+1,end);
		 
		
	 }
	 public static void main(String[] args) {
		 int a[]= {1,2,3,4,5,5,6,7,8};
			System.out.println(search(a,5,0,a.length-1));
	}
}
