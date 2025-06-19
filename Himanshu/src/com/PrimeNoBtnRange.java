package com;


public class PrimeNoBtnRange {
 public static void main(String[] args) {
	boolean flag=true;
	
	for(int i=100;i>=1;i--) {
		if(i<=1)continue;
		flag=true;
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println(i+" ");
		
//		break;
		}
	}

}
}
