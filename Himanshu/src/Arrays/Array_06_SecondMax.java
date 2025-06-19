package Arrays;

public class Array_06_SecondMax {
	 public static void main(String[] args) {
			int a[]= {1,2,4,7,8,9,10};
			int max1=0,max2=0;
			
			for(int n:a) {
				if(n>max1) {
					max2=max1;
					max1=n;				
				}
//				System.out.println(max2);
				if(n>max2 && n<max1) {
	                  max2=n;					
					}
			}
			System.out.println(max1);
			System.out.println(max2);
		}
}
