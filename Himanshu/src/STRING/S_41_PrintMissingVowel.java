package STRING;

public class S_41_PrintMissingVowel {
 public static void main(String[] args) {
	String s="himanshu";
	String vow="aeiouAEIOU";
	
	for(int i=0;i<vow.length();i++) {
//		String ch=Character.toString(vow.charAt(i)); 
		char ch=vow.charAt(i);
		if(!s.contains(ch+"")){
			System.out.println(ch);
		}
	}
}
}
