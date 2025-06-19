package STRING;

public class S_18_HighestOccuranceCharcter {
	public static void main(String[] args) {
		String s="himanshu bhusan biswal";
		char ch[]= s.toCharArray();
        int max=0;
        char maxChar=' ';
		for(int i=0;i<ch.length;i++) {
			int count=1;
			if(ch[i]=='\u0000') continue;
			
			for(int j=i+1;j<ch.length;j++) 
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\u0000';
				}	
				
			}
			if(count>max) {
				max=count;
				maxChar=ch[i];
			}
		}
		System.out.println(maxChar+" = "+max);
	}
}
