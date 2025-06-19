package MapFramework;
import java.util.Map;
import java.util.TreeMap;
public class MapFramework_04_TreeMap {
 public static void main(String[] args) {
	Map<String,Integer> m=new TreeMap<String, Integer>();
	m.put("Dhoni", 7);
	m.put("Kohli", 18);
	m.put("Rahul", 1);
	System.out.println(m);
}
}
