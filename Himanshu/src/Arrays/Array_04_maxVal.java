package Arrays;

public class Array_04_maxVal {
 public static void main(String[] args) {
	int a[]= {1,2,4,7,8,9,10};
	int max=0;
	
	for(int n:a) {
		if(n>max) max=n;
	}
	System.out.println(max);
}
}
