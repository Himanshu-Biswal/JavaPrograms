package STRING;

public class S_07_SumNum {
 public static void main(String[] args) {
	String s="himanshu@ 1234";
	int sum=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='0' && ch<='9') {
			sum=sum+(ch-'0');
		}
	}
	System.out.println(sum);
}
}
