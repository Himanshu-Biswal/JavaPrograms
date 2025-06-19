package Arrays;

public class Array_11_LinearSearch {
	
	static int search(int a[],int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) return i;
		}
		return -1;
	}
 public static void main(String[] args) {
	int a[]= {1,2,3,4,5,5,6,7,8};
	System.out.println(search(a,5));
}
}


// Recursion

//static int sort(int a[],int key,int st,int end) {
//    if(st>end) return -1;
//    else if(key==a[st]) return st;
//    return sort(a, key, st+1, end);
//}
//public static void main(String[] args) {
//int a[] ={7,8,9,5,4,3,1};
//
//System.out.println(sort(a,3,0,a.length-1));
//}