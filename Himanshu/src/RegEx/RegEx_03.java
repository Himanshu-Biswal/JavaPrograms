package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_03 {
	public static void main(String[] args) {
		String s="abcABCD1234555";
		String ex="[0-9]";
		
		Pattern p = Pattern.compile(ex);
		Matcher m = p.matcher(s);
		
		int count=0;
		
		while(m.find()) {
			count++;
		}
		System.out.println(ex+"="+count);
	}
}
