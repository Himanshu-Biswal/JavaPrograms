package Recursion;

public class Power {
	static int pow(int b,int p){
		if(p==0) return 1;
		return b*pow(b,p-1);
	}
	
	public static void main(String[] args) {
    int b=5,p=3;
    System.out.println(pow(b,p));
}
}