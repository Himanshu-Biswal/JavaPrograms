package STRING;

public class S_40_Panagrame {
 static boolean isPanagrame(String s) {
	 if(s.length()<26) {
		 return false;
	 }
	 s=s.toLowerCase();
	 for(char ch='a';ch<='z';ch++) {
		 if(!s.contains(ch+"")) return false;
	 }
	 return true;
 }
 public static void main(String[] args) {
	String s="abcdefghijklmnopqrstuvwxyznn";
//	s=s.toUpperCase();
//	System.out.println(s);
	System.out.println(isPanagrame(s));
}
}
