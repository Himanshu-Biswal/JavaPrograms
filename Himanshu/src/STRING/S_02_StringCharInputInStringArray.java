package STRING;

import java.util.Arrays;

public class S_02_StringCharInputInStringArray {
 public static void main(String[] args) {
	 String s="Himanshu";
	  String str[]=new String[s.length()];
	  
	  for(int i=0;i<s.length();i++) {
		  char ch=s.charAt(i);
		  str[i]=ch+"";
	  }
	  
	  System.out.println(Arrays.toString(str));
}
}
