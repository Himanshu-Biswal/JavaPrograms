package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Z_1 {
 public static void main(String[] args) {
	String s="ABannC@!@#@123";
	String exp="(?=.*[a-z])";  
	
	Pattern p = Pattern.compile(exp);
	Matcher m = p.matcher(s);
	
	System.out.println(m.find());
}
}

//?=*[a-z]  ( * => 0 (or) more)  ( + => 1 (or) more)  ( ? => 0 (or) only 1);

