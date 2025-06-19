package STRING;

import java.util.LinkedList;
import java.util.List;

public class S_43_FindStringLengthWithoutUsingLengthMethod {
	 public static void main(String[] args) {
	           String s="Hello World!";
	       	List<Character> l=new LinkedList<Character>();
	       	for(int i=0;i<s.length();i++) {
	       		l.add(s.charAt(i));
	       	}
	        System.out.println(" length : " + l.size());
	    }
}
