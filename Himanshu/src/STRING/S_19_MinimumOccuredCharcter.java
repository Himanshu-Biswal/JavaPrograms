package STRING;

public class S_19_MinimumOccuredCharcter {
 public static void main(String[] args) {
	String s="jaaaaaavvvvaa";
	char ch[]=s.toCharArray();
	int min=Integer.MAX_VALUE,min1=Integer.MAX_VALUE;
	char minChar=' ',minchar1=' ';
	
	for(int i=0;i<ch.length;i++) {
		int count=1;
		if(ch[i]=='\u0000') continue;
		
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
				ch[j]='\u0000';
			}
		
		}
//		System.out.println(count);
//		System.out.println("=======================");
		if(min>count) {
			min=count;
//			System.out.println(min);
			minChar=ch[i];
		}
		
		if(min1>count && count>min) {
			min1=count;
//			System.out.println(min);
			minchar1=ch[i];
		}
	}
	System.out.println( minChar+" = "+ min);
	System.out.println( minchar1+" = "+ min1);
}
}
