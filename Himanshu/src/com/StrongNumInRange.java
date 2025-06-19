package com;

import java.util.Scanner;
public class StrongNumInRange {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter range:");
	 
	 int st=sc.nextInt();
	 int end=sc.nextInt();
	 
	 for(int i=st;i<=end;i++) {
		
		 int sum=0;
		 int k=i;
		 while(k!=0) {
			 int r=k%10;
			 int fact=1;
			 for(int j=1;j<=r;j++) {

				 fact=fact*j;
			 }
			sum=sum+fact; 
			k=k/10;
		 }
		 if(i==sum)System.out.println(i+" is strong number");
	 }
	 sc.close();
}
}
