package D.S.A;

 class Stack {
 Node head;
 int count=0;
 public void push(Object ele) {
	 if(head==null) {
		 head=new Node(ele);
		 count++;
		 return;
	 }
	 head=new Node(ele,head);
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
 public Object pop() {
	 Object ele=head.ele;
	 head=head.next;
	 count--;
	 return ele;
 }
}
 public class DSA_01_List_Stack{
	 public static void main(String[] args) {
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
//		System.out.println(s.size());
//		System.out.println(s.peek());
		while(!s.isEmpty())System.out.println(s.pop());
		
	}
 }

