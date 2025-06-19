package STRING;

public class S_05_CaseCount {
	 public static void main(String[] args) {
			String s="Himanshu@435MADHU@23####";
			int u=0,l=0,sy=0,n=0;
        	for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch>='a' && ch<='z') l++;
				else if(ch>='A' && ch<='Z') u++;
				else if(ch>='0' && ch<='9') n++;
				else sy++;
			}
        	
        	System.out.println(u+" "+l+" "+sy+" "+n);
}
}