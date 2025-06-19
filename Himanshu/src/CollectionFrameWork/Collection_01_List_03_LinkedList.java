package CollectionFrameWork;

import java.util.LinkedList;

public class Collection_01_List_03_LinkedList {
 public static void main(String[] args) {
	LinkedList<String> l= new LinkedList<String>();
	l.add("Himanshu");
	l.add("Biswal");
	
	System.out.println(l);
	System.out.println(l.get(1));
	l.add(1,"Bhusan");
	System.out.println(l);
	System.out.println(l.isEmpty());
}
}
