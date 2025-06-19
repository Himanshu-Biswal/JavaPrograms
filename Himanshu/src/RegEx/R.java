package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R {
 public static void main(String[] args) {
	String s="himanshu@435";
	String exp="[a-z][a-z0-9$]+@gmail[.]com";
	
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(s);
	if(m.matches()) System.out.println("ok");
	else System.out.println("no");
}
}
