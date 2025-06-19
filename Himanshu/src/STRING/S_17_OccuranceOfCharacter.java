package STRING;

public class S_17_OccuranceOfCharacter {
 public static void main(String[] args) {
	String s="himanshu bhusan biswal";
	char ch[]= s.toCharArray();

	for(int i=0;i<ch.length;i++) {
		int count=1;
		if(ch[i]=='\u0000' || ch[i]==' ') continue;
		
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
				ch[j]='\u0000';
			}	
		
		}
		System.out.println(ch[i]+"="+count);
	}
	
}
}
