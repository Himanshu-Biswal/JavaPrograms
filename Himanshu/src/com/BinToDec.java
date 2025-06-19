package com;

 import java.util.Scanner;
public class BinToDec {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a binary number:");
		int n = sc.nextInt();
		int d=0;
		int i=1;
		
		while(n!=0) {
			int r=n%10;
			d+=i*r;
			n/=10;
			i*=2;
		}
		System.out.println(d);
		sc.close();
	}

}
