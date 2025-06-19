package CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_03_Set_01 {
 public static void main(String[] args) {
	Set<String> s= new HashSet<String>();
	s.add("himanshu");
	s.add("bhusan");
	s.add("biswal");
//	s.add("king");
//	s.add("thala");
//	s.add("hitman");
//	s.add(1);
//	s.add(2);
//	s.add(3);
	System.out.println(s);
		Iterator<String> i=s.iterator();
		while(i.hasNext())System.out.println(i.next());
}
}
