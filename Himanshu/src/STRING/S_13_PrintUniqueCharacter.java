package STRING;

public class S_13_PrintUniqueCharacter {
	public static void main(String[] args) {
	
	String s="Ramana kumar";
	char ch[]=s.toCharArray();
	String res="";
	for(int i=0;i<ch.length;i++) {
		int count =1;
		if(ch[i]=='\u0000') continue;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j] ) {
				ch[j]='\u0000';
				count++;
			}
		
		}
//		System.out.println(ch[i]+"="+count);
		if(count==1)
		res+=ch[i];
	}
	System.out.println(res);
}
}