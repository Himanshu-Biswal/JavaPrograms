package CollectionFrameWork;
import java.util.ArrayDeque;
import java.util.Queue;
public class Collection_02_Queue_01 {
 public static void main(String[] args) {
	Queue<Integer> q=new ArrayDeque<Integer>();
	q.add(7);
	q.add(8);
	q.add(9);
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q.peek());
	System.out.println(q.size());
	System.out.println(q.isEmpty());
}
}
