package RegEx;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
 
public class RegEx_01 {
 public static void main(String[] args) {
	String s="abababced";
	String ex="aba";
	
	Pattern p = Pattern.compile(ex);
	Matcher m = p.matcher(s);
//	System.out.println(m.find());
//	System.out.println(m.find());
//	System.out.println(m.find());
//	System.out.println(m.find());
//	System.out.println(m.find());
	
	while(m.find()) {
		System.out.println(p);
	}
}
}
