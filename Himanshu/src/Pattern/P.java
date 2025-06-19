package Pattern;

public class P {
 public static void main(String[] args) {
	int n=5,odd=0;
	for(int i=1;i<=n;i++) {
     if(i%2!=0) {
    	 for(int j=1;j<=i;j++) {
    		 odd++;
    		 System.out.print(odd+" ");
    	 }
     }
     else {
    	 int even=odd+i;
    	 odd=even;
    	 for(int j=1;j<=i;j++) {
    		 System.out.print(even+" ");
    		 even--;
    	 }
     }
		System.out.println();
	}
}
}
