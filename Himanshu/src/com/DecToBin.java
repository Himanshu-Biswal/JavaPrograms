package com;

 import java.util.Scanner;
public class DecToBin {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a decimal number :");
	int n=sc.nextInt();
	int bin=0,i=1;
	
	while(n!=0) {
		int r=n%2;
		bin+=i*r;
		n/=2;
		i*=10;
	}
	System.out.println(bin);
	sc.close();
}
}
