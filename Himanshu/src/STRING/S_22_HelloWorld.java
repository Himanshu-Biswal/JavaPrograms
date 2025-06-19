package STRING;
// i/p:- hello world!
// o/p:- he121 w2r3d 
public class S_22_HelloWorld {
 public static void main(String[] args) {
	String s="hello world!";
	char ch[]=s.toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		if(ch[i]>='0' && ch[i]<='9') continue;
		char count='1';
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
				ch[j]=count;
			}
		}
		if(count!='1') {
			ch[i]='1';
		}
	}
	System.out.println(ch);
}
}
