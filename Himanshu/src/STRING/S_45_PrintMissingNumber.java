package STRING;

public class S_45_PrintMissingNumber {
 public static void main(String[] args) {
	String s="Himanshu123";
	String num="0123456789";
	
	for(int i=0;i<num.length();i++) {
		char ch=num.charAt(i);
		if(!s.contains(ch+"")) {
			System.out.println(ch);
		}
	}
}
}
