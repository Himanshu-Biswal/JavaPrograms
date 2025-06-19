package Pratice;

public class Sum {
	
	
	
	
 public static void main(String[] args) {
//int c=0;
	 for(int i=1;i<=100;i++) {
		 int temp=i;
		 int c=0;
    int sum=0,prod=1;
    while(temp!=0 ) {
    	int r=temp%10;
    	sum+=r;
    	prod*=r;
    	temp=temp/10;
    }
    if(sum==prod) {
    	
    
    	c++;}
    	if(c%2!=0)
    	{
    		System.out.println(i);
	     }
	 }
}
}



