package Arrays;

import java.util.Scanner;

public class Array_02_EvenNum {
 public static void main(String[] args) {
	 @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter & numbers of Array:");
	int a[]=new int[7];
	a[0]=sc.nextInt();
	a[1]=sc.nextInt();
	a[2]=sc.nextInt();
	a[3]=sc.nextInt();
	a[4]=sc.nextInt();
	a[5]=sc.nextInt();
	a[6]=sc.nextInt();
	
	for(int s:a) {
		if(s%2==0) System.out.println("The even number is:-"+s);
	}
	
//	for(int i=0;i<a.length;i++) {
//		if(a[i]%2==0) System.out.println("The even number is:-"+a[i]);
//	}
}
}
