package STRING;

public class S_26_Split {
	
	static boolean isPal(String s) {
		int i=0;
		int j=s.length()-1;

		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
 public static void main(String[] args) {
//	String s="Java Is Easy";
	 String s="madam sir madam ";
	String [] str =s.split(" ");//Array Type String

		for(int i=0;i<str.length;i++) {
			if(isPal(str[i])){
				System.out.println(str[i]+" is palindrome");
			}
			else System.out.println(str[i]+" is not palindrome");
		}

	
//	if(isPal(s)){
//		System.out.println(s+" is palindrome");
//	}
//	else System.out.println(s+" is not palindrome");
}
}
