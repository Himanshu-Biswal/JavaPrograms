package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_04 {
	public static void main(String[] args) {
		String s="abcabcdac";
		String ex="[b]c";
		
		Pattern p = Pattern.compile(ex);
		Matcher m = p.matcher(s);
		
		int count=0;
		
		while(m.find()) {
			count++;
//			System.out.println();
		}
		System.out.println(ex+"="+count);
	}
}
