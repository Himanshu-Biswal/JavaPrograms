package STRING;

public class S_20_SecondMaxOccuranceChar {
	public static void main(String[] args) {
		String s="himanshu bhusan biswal";
		int max=0,max1=0;
		char ch1=' ',ch2=' ';
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int c=1;
			if(ch[i]=='\u0000') continue;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					c++;
					ch[j]='\u0000';
				}
			}
			if(c>max) {
				max=c;
				ch1=ch[i];
			}
			if(c>max1 && c<max) {
				max1=c;
				ch2=ch[i];
			}
//			System.out.println(ch[i]+":"+c);
		}
		System.out.println(ch1+":"+max);
		System.out.println(ch2+":"+max1);
	}
	}
