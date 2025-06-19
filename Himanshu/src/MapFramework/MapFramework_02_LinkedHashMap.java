package MapFramework;
import java.util.*;
public class MapFramework_02_LinkedHashMap {
 public static void main(String[] args) {
	 String s="banana";
	Map<Character,String> m=new LinkedHashMap<Character, String>();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(!m.containsKey(ch))m.put(ch, i+"");
		else m.put(ch, m.get(ch)+","+i);
	}
//	System.out.println(m);
	Set<Character>set=m.keySet();
	Iterator<Character>i=set.iterator();
	while(i.hasNext()) {
		Object k=i.next();
		Object v=m.get(k);
		System.out.println(k+":"+v);
	}
}
}
