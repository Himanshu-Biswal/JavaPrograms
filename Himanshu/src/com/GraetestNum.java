package com;

public class GraetestNum {
 public static void main(String[] args) {
	int n=999599;
	int max=0;
	//int min=n%10;
	int min = 9;
	while(n!=0) {
		int r=n%10;
		if(r==9) {
			max=9;
		}
		
		else {
			if(r>max) {
				max=r;
			}
		}
		
		if(r==0) {
			min=0;
		}
		else
		{
			if(r<min) {
				min=r;
			}
		}
		n=n/10;
	}
	System.out.println("Maximum number is:"+ max );
	System.out.println("Minimum number is:"+ min);
}
}
