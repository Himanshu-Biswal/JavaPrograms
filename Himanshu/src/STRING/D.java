package STRING;

public class D{
  static void per(String s,int st,int end) {
	  if(st==end) {
		  System.out.println(s);
		  return;
	  }
	  for(int i=st;i<end;i++) {
		  String s1=swap(s,st,i);
		  per(s1, st+1, end);
	  }
  }
	  private static String swap(String s, int i, int j) {
	 char ch[]=s.toCharArray();
	 char temp = ch[i];
	 ch[i]=ch[j];
	 ch[j]=temp;
	return new String(ch);
}
	public static void main(String args[]){
	   String s="abc";
	   per(s, 0, s.length());
	}
}

