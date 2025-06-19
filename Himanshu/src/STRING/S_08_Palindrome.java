package STRING;

public class S_08_Palindrome {
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
	String s="malayalam";
	if(isPal(s)) System.out.println(s+" is palindrome");
	else System.out.println(s+" is not palindrome");
}
}
