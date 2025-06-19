package MapFramework;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class MapFramework_01_HashMap {
 public static void main(String[] args) {
	Map<Integer,String> m= new HashMap<Integer, String>();
	m.put(7, "Thala");
	m.put(18, "King");
	m.put(33, "Pandya");
	m.put(45, "Rohit");
	m.put(1, "Kl");
//	System.out.println(m);
	Set<Integer>s=m.keySet();
	Iterator<Integer> i= s.iterator();
	while(i.hasNext()) {
		Object k=i.next();
		Object v=m.get(k);
		System.out.println(k+":"+v);
	}
}
}
