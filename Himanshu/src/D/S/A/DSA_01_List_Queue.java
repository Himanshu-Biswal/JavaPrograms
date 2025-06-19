package D.S.A;
class Queue{
	Node2 head;
	int count=0;
	Node2 tail;
	public void add(Object ele) {
		if(head==null) {
			head=new Node2(ele);
			tail=head;
			count++;
			return;
		}
		tail.next=new Node2(ele);
		tail=tail.next;
		count++;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public Object peek() {
		return head.ele;
	}
	public Object poll() {
		Object ele=head.ele;
		head=head.next;
		count--;
		return ele;
	}
}
public class DSA_01_List_Queue {
 public static void main(String[] args) {
	 Queue q=new Queue();
	 q.add(1);
	 q.add(2);
	 q.add(3);
	 q.add(4);
	 q.add(5);
//	 System.out.println(q.size());
//	 System.out.println(q.peek());
//	 System.out.println(q.poll());
	 while(!q.isEmpty())System.out.println(q.poll());
}
}
