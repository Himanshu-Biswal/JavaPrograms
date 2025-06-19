package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_05_06_07 {
	public static void main(String[] args) {
///* 05 */ String s="91bc2ab33cb5e7c2b45";
//		 String ex="[abc][0-9]";
		
///* 06 */ String s="ababcad162#2gdh";
//         String ex="a..a"; 
		
/* 07 */ String s="a.bab.cad162#2gdh";
        String ex="[.]"; //2
///* 08 */ String s="himanshu";
//        String ex="."; // 8
		
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
