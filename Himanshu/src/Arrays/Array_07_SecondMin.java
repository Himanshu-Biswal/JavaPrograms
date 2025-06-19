package Arrays;

public class Array_07_SecondMin {
	public static void main(String[] args) {
		int a[]= {1,2,4,7,8,9,11,10};
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		
		for(int n:a) {
			if(n<min1) {
				min2=min1;
				min1=n;
				
			}
			if(n<min2 && n>min1) {
                  min2=n;					
				}
		}
		System.out.println(min1);
		System.out.println(min2);
	}
}
