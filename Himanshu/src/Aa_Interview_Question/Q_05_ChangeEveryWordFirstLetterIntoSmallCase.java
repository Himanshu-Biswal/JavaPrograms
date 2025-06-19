package Aa_Interview_Question;

public class Q_05_ChangeEveryWordFirstLetterIntoSmallCase {
 public static void main(String[] args) {
	String s="Himanshu Bhusan Biswal";
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(i==0 || ch[i-1]==' ') {
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}
		}
	}
	System.out.println(ch);
}
}
