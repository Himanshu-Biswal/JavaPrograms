package STRING;

public class S_38_CharIndexValue {
 public static void main(String[] args) {
	String s="banana";

	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {

		if(ch[i]=='\u0000')continue;
		System.out.print(ch[i]+":"+i+" ");
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				System.out.print(j+" ");
				ch[j]='\u0000';
			}
		}
		System.out.println();
	}
}
}
