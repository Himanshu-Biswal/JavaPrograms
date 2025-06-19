package STRING;

public class S_37_AnagramInRecursion {
	static boolean ana(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		else if(s1.length()==0 && s2.length()==0) return true;
//		String ch=String.valueOf(s1.charAt(0));	
		char ch=s1.charAt(0);
//    return ana(s1.replace(ch,""),s2.replace(ch, ""));
    return ana(s1.replace(ch+"",""),s2.replace(ch+"", ""));
	}
  public static void main(String[] args) {
	  String str1 = "listen";
      String str2 = "silent";
      System.out.println(ana(str1, str2));
}
}
