package CollectionFrameWork;

import java.util.Stack;

public class Collection_01_List_04_Stack {
 public static void main(String[] args) {
	Stack<Integer> s= new Stack<Integer>();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	s.push(5);
	System.out.println(s.pop());
	System.out.println("===");
	while(!s.isEmpty()) System.out.println(s.pop());
}
}
