package STRING;

public class S_25_ReplaceVowelTo___ {
 public static void main(String[] args) {
	String s="kukka pilla";
	char ch[]=s.toCharArray();
	 
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' || ch[i]=='a'
				|| ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
			ch[i]='_';
		}
	}
	System.out.println(ch);
}
}
