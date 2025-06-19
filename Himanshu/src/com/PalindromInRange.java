package com;

public class PalindromInRange {
 public static void main(String[] args) {
	for(int i=10;i<=100;i++) {
		int temp=i;
		int rev=0;
		while(temp!=0) {
			int r=temp%10;
			rev=rev*10+r;
			temp=temp/10;
		}
		if(i==rev) {
			System.out.println(i);
		}
	}
}
}
