package STRING;

public class S_27_RemoveDuplicateWord{
 public static void main(String[] args) {
	String s="Banglore is Banglore city";
	System.out.println(removeDup(s));
}
 
 static String removeDup(String s) {
	 String res=" ";
	 String [] str=s.split(" ");
	 
	 for(int i=0;i<str.length;i++) {
		 if(str[i]==" " || str[i]==null) continue;
		 for(int j=i+1;j<str.length;j++) {
			 if(str[i].equals(str[j])) {
				 str[j]=null;
			 }
		 }
		 res+=str[i];
		 res+=" ";
	 }
	 return res.trim();
 }
}
