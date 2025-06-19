package STRING;
//i/p:-2a7b1c;
//o/p:-aabbbbbbbc;
public class S_23_NumberToCharSequence {
 public static void main(String[] args) {
	String s="2a3b1c"; //2a3b1c
	String res="";
	for(int i=0;i<s.length();i+=2) {
		int count = 0;
		if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			 count = s.charAt(i)-'0';
		}
			char ch=s.charAt(i+1);
		for(int j=1;j<=count;j++) {
			res+=ch;
		}
	}
	System.out.println(res);
}
	
//	public static void main(String[] args) {
//		String s=""; //2a3b1c
//		String res="";
//		for(int i=0;i<s.length();i+=3) {
//			int count = 0;
//			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
//				 count = s.charAt(i)-'0';
//			}
//				char ch=s.charAt(i+1);
//			for(int j=1;j<=count;j++) {
//				res+=ch;
//			}
//		}
//		System.out.println(res);
//	}
}
