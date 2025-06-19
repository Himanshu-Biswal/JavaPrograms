package Aa_Interview_Question;

public class Q_06_Find3rdLargestString {
 public static void main(String[] args) {
	String s="My name is Himanshu Bhusan Biswal and i am from odisha ";
	String str[]=s.split(" ");
	String s1="",s2="",s3="";
	for(int i=0;i<str.length;i++) {
		if(str[i].length()>s1.length()) s1=str[i];
		if(str[i].length()>s2.length() && str[i].length()<s1.length()) s2=str[i];
		if(str[i].length()>s3.length() && str[i].length()<s2.length() ) s3=str[i];
	}
	System.out.println(s1+","+s2+","+s3);
	
}
}
