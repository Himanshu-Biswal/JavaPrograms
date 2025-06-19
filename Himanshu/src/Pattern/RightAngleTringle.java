package Pattern;

public class RightAngleTringle {
 public static void main(String[] args) {
	int n=5;
	int k=0;
    for(int i=1;i<=n;i++) {
    	//k=k+i;
    	if(i%2!=0) {
    		//int l= k-i;
    	for(int j=1;j<=i;j++) {  //	for(int j=i;j<=n;j++)  FOR REVERSE
    		//l++;
    		k++;
    		System.out.print(k+" ");
    	}
    }
    	
    	else {
    		int m=k+i;//m=k;
    		k=m;
    		for(int j=1;j<=i;j++) { 
        		System.out.print(m+" ");
        		m--;
        	}
    	}
    	System.out.println();
    }
}
}
