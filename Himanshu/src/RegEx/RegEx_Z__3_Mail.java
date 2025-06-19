package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Z__3_Mail {
	public static void main(String[] args) {
		String s="ann77@gmail.com";
		String exp="[a-z][a-z0-9]+@gmail[.]com";  
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		if(m.matches()) System.out.println("Valid Mail");
		else System.out.println("Invalid Mail");
	}
}
