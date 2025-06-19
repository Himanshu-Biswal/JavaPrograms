package STRING;

public class S_39_StringPermutation {
	
	static void isPermutataion(String s,int st,int end) {
		if(st==end) {
			System.out.println(s);
			return;
		}
		for(int i=st;i<end;i++) {
			String s1=swap(s,st,i);
			isPermutataion(s1, st+1, end);
		}
	}
  static String swap(String s, int i, int j) {
		char ch[]=s.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return new String(ch);
		
	}
public static void main(String[] args) {
	String s="abc";
	isPermutataion(s, 0, s.length());
}
}

	