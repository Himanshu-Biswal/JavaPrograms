package STRING;

// abcde ----- adcbe
// 01234 ----- 03214
public class S_44_SwapCharcter {
 public static void main(String[] args) {
	String s="abcde";  
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length-3;i++) {
		if(i%2==0) {
			char temp=ch[i+1];
			ch[i+1]=ch[i+3]; 
			ch[i+3]=temp;
		}
		
	}
//	 String result = new String(ch);
//     System.out.println(result);
	System.out.println(ch);
}
}
