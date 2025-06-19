package RegEx;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
 
public class RegEx_02 {
 public static void main(String[] args) {
	String s="abababced";
	String ex="ab";
	
	Pattern p = Pattern.compile(ex);
	Matcher m = p.matcher(s);
	System.out.println(m.find());
	System.out.println(m.find());
	System.out.println(m.find());
	System.out.println(m.find());
	System.out.println(m.find());
	
	int count=0;
	
	while(m.find()) {
		count++;
	}
	System.out.println(ex+"="+count);
}
}
