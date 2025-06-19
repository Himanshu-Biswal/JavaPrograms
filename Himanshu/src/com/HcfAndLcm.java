package com;

public class HcfAndLcm {
 public static void main(String[] args) {
	int a=6,b=6;
	int n=a>b?a:b;

	int h = 1;
	for(int i=2;i<=n/2;i++) {
		if((a%i==0) &&(b%i==0) ) {
		h=i;
		}
	}
	
	System.out.println("HCF of "+a+" and "+b+" is : "+h);
	int l=1;
 while(n!=0) {
	 if(n%a==0 && n%b==0) {
		 l=n;
		 break;
	 }
n++;

 }
 System.out.println("LCM of "+a+" and "+b+" is : "+l);
}
}
