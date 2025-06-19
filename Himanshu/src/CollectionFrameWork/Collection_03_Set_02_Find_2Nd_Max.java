package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Collection_03_Set_02_Find_2Nd_Max {
 public static void main(String[] args) {
	int a[]= {6,5,7,8,8,1,2,5,3,3,4,0,0,7,7,9,9,9,0,8};
	
	List<Integer> l = new ArrayList<Integer>();
	for(int n:a)l.add(n);
	Collections.sort(l);
	
	Set<Integer> s= new LinkedHashSet<Integer>();
	for(int n:l)s.add(n);
	System.out.println(s);
	
	List<Integer> l1 = new ArrayList<Integer>();
	for(int n:s)l1.add(n);
	ListIterator<Integer> list = l1.listIterator(l1.size());
   int c=0;
	for(int i=1;i<=l1.size();i++) {
		if(list.hasPrevious()) {
			int n=list.previous();
			c++;
			if(c==2)
			{
				System.out.println(n);
			}
		}
	}
}
}
