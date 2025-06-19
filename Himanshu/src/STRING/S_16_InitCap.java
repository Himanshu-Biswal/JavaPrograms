package STRING;

public class S_16_InitCap {
	
//	static String init(String s) {
//		char ch[] = s.toCharArray();
//	 for(int i=0;i<ch.length;i++) {
//		 if(i==0 || ch[i-1]==' ') {
//			 if(ch[i]>='a' && ch[i]<='z') {
//				 ch[i]-=32;
//			 }
//		 }
//	 }
//	 return new String(ch);
//	}
  public static void main(String[] args) {
	String s="himanshu bhusan biswal";
//	System.out.println(init(s));
	char ch[] = s.toCharArray();
	 for(int i=0;i<ch.length;i++) {
		 if(i==0 || ch[i-1]==' ') {
			 if(ch[i]>='a' && ch[i]<='z') {
				 ch[i]-=32;
			 }
		 }
	 }
	 System.out.println(ch);
}
}
