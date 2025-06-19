package STRING;

// Java Is Easy
// avaJ sI ysaE
public class S_09_ReverseWord {
 static String rev(String s) {
	 int i=0,j=0;
	 String res="";
	 while(j<s.length()) {
		 while(j<s.length() && s.charAt(j)!=' ') j++;
		 int k=j-1;
		 while(k>=i) {
			 res+=s.charAt(k);
			 k--;
		 }
		 if(j<s.length()) res+=" ";
		 i=j;
		 j++;
		
	 }
	 return res;
 }
 public static void main(String[] args) {
	String s="Java Is Easy";
	System.out.println(rev(s));
}
}
