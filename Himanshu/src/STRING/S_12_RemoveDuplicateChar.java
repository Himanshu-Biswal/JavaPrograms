package STRING;

public class S_12_RemoveDuplicateChar {
	public static void main(String[] args) {
		String s="java dev";
		char [] ch= s.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='\u0000') continue; //\u0000 is the null character
			
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='\u0000';
				}
			}
			
			res+=ch[i];
		}
		System.out.println(res);
	}
}
