package STRING;

// Java Is Easy
// Easy Is  Java 
public class S_10_ReverseWords {

	 static String rev(String s) {
		 int i=s.length()-1,j=s.length()-1;
		 String res="";
		 while(j>=0) {
			 while(j>=0 && s.charAt(j)!=' ') {
				 j--;
			 }
			 int k=j+1;
			 while(k<=i) {
				 res+=s.charAt(k);
				 k++;
			 }
			 

			 if(j>=0) {
				 res+=" ";
			 }
			 i=j;
			 j--;
			 
		 }
		 return res;
	 }
	 public static void main(String[] args) {
		String s="Java Is Easy";
		System.out.println(rev(s));
	}
	}


