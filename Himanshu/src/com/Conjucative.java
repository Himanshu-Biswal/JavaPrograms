package com;
 import java.util.Scanner;
public class Conjucative {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	int n= sc.nextInt();
	
	if(n!=0) {
		if(n>0 && n%2==0) {
			System.out.println(n);
			System.out.println((n+2)+" "+(n+4)+" "+(n+6));
		}
		else if(n<0 && n%2!=0){
			System.out.println(n);
			System.out.println((n-2)+" "+(n-4)+" "+(n-6));
		}
		else System.out.println("invalid input");
	}
	sc.close();
}
}
