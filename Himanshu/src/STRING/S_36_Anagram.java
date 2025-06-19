package STRING;

//import java.util.Arrays;

public class S_36_Anagram {
	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";
	        
	        System.out.println(isAnagram(str1, str2));
	    }

	    public static boolean isAnagram(String s1, String s2) {
	    	while(true) {
	    		if(s1.length()!=s2.length()) {
	    			return false;
	    		}
	    		else if(s1.length()==0 && s2.length()==0) {
	    			return true;
	    		}
	    		char ch=s1.charAt(0);
	    		s1=s1.replace(ch+"","");
//	    		System.out.println("s1:"+s1);
//	    		System.out.println("=====================");
	    		s2=s2.replace(String.valueOf(ch),"");
//	    		System.out.println("s2:"+s2);
	    	}
	    }
	}


