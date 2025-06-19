package com;

import java.util.Scanner;

public class AmstrongInRange {
 public static void main(String[] args) {
	
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter range:");
	 
	 int st=s.nextInt();
	 int end=s.nextInt();
	 
	 for(int i=st;i<=end;i++) {
		// int j=i;
		 int sum=0;
		 int count=0;
		 int temp=i;
		while(temp!=0) {
			temp/=10;
			count++;
		}
		temp=i;
		while(temp!=0) {
			int r=temp%10;
			int p=1;
			//sum+=Math.pow(r, count);
			for(int j=1;j<=count;j++) {
				p=p*r;
			}
			sum+=p;
		temp/=10;
		}
		if(i==sum)System.out.println(i);
	 }
	 
	 s.close();
}
}
