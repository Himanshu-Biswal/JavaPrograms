package Aa_Interview_Question;

public class Q_02_String {
 public static void main(String[] args) {
	String s="Himanshu",s1="",s2="",res="";
	int n=s.length();
	for(int i=n/2-1;i>=0;i--) {
		s1+=s.charAt(i);
	}
	for(int i=n/2;i<s.length();i++) {
//		s2+=s.charAt(i);
		s2+='#';
	}
	res=s1+s2;
	System.out.println(res);
}
}
