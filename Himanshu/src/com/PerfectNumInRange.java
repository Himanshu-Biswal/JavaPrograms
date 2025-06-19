package com;

 import java.util.Scanner;
public class PerfectNumInRange {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter range:");
	 
	 int start=sc.nextInt();
	 int end=sc.nextInt();
	 
	 for(int i=start;i<=end;i++) {
		 int sum=0;
		 
		 for(int j=1;j<=i/2;j++) {
			 if(i%j==0) {
				 sum=sum+j;
			 }
		 }
		 
		 if(i==sum) System.out.println(i+" is a perfect number");
	 }
	 sc.close();
}
}
