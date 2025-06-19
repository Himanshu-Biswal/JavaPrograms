package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Z_2_Password{
	 public static void main(String[] args) {
		String s="annC7@";
		String exp="(?=.*[a-z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*]).{4,6}";  
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		if(m.matches()) System.out.println("Valid Password");
		else System.out.println("Invalid Password");
	}
	}


