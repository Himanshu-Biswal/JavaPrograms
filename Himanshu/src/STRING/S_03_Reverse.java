package STRING;

public class S_03_Reverse {
 public static void main(String[] args) {
	String s="Himanshu"; //  uhsnamiH
	
	
	String res="";
	
	for(int i=s.length()-1;i>=0;i--) {
		res+=s.charAt(i);
	}
	System.out.println(res);
}
}
