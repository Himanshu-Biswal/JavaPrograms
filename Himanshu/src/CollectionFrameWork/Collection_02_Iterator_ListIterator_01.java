package CollectionFrameWork;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Collection_02_Iterator_ListIterator_01 {
 public static void main(String[] args) {
//	 List<Integer> l= new ArrayList<Integer>();
//		l.add(7);
//		l.add(8);
//		l.add(9);
//		l.add(10);
//		l.add(11);
	 
	 List<Integer> l=Arrays.asList(10,20,30,40,50);
	 System.out.println(l);
	 
	 ListIterator<Integer> list=l.listIterator();
	 while(list.hasNext())System.out.println(list.next());
	 System.out.println("=============");
	 while(list.hasPrevious())System.out.println(list.previous());
}
}
