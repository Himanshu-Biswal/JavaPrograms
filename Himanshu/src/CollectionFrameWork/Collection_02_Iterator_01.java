package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_02_Iterator_01 {
 public static void main(String[] args) {
	List<Integer> l= new ArrayList<Integer>();
	l.add(7);
	l.add(8);
	l.add(9);
	l.add(10);
	l.add(11);
	
	Iterator<Integer> i = l.iterator();
//	System.out.println(i.next());
//	System.out.println(i.hashCode());
//	i.remove();
//	i.remove();

	while(i.hasNext()) {
		int n=i.next();
		if(n==10 || n==11) i.remove();
//		System.out.println(i.next());
	}
	System.out.println(l);
}
}
