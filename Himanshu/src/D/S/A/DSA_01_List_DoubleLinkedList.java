package D.S.A;

class DoubleLinkedList {
 Node2 head;
 int count=0;
 Node2 tail;
 
 public void add(Object ele) {
	 if(head==null) {
		 head=new Node2(ele);
		 count++;
		 return;
	 }
	 Node2 curr=head;
	 while(curr.next!=null) {
		 curr=curr.next;
	 }
	 curr.next=new Node2(curr,ele,null);
	 tail=curr.next;
	 count++;
 }
 public int size() {
	 return count;
 }
 public boolean isEmpty() {
	 return count==0;
 }
 public void display() {
	 Node2 curr=head;
	 while(curr!=null) {
		 System.out.println(curr.ele);
		 curr=curr.next;
	 }
 }
 public void reverseDisplay() {
	 Node2 curr=tail;
	 while(curr!=null) {
		 System.out.println(curr.ele);
		 curr=curr.prev;
	 }
 }
 public Object get(int index) {
	 if(index<0 || index>=size())
		 throw new IndexOutOfBoundsException();
	 Node2 curr=head;
	 for(int i=0;i<index;i++) {
		 curr=curr.next;
	 }
	 return curr.ele;
 }
 public void addPos(Object ele ,int index) {
	 if(index<0 || index>size())
		 throw new IndexOutOfBoundsException();
	 if(index ==0) {
		 addFirst(ele);
		 return;
	 }
	 if(index==size()) {
		 addLast(ele);
		 return;
	 }
	 Node2 n=new Node2(ele);
	 Node2 curr=head;
	 for(int i=1;i<index;i++) {
		 curr=curr.next;
	 }
	 curr.next.prev=n;
	 n.next=curr.next;
	 n.prev=curr;
	 curr.next=n;
	 count++;
 }
 
 private void addLast(Object ele) {
	Node2 n=new Node2(ele);
	n.prev=tail;
	tail.next=n;
	count++;
	tail=n;
	
}
private void addFirst(Object ele) {
	Node2 n=new Node2(ele);
	n.next=head;
	head.prev=n;
	count++;	
}
public void remove(int index) {
	 if(index<0 || index>=size())
		 throw new IndexOutOfBoundsException();
	 if(index==0) {
		 head=head.next;
		 head.prev=null;
		 count--;
		 return;
	 }
	 if(index==size()-1) {
		 tail=tail.prev;
		 tail.next=null;
		 count--;
		 return;
	 }
	 Node2 curr=head;
	 for(int i=1;i<index;i++) {
		 curr=curr.next;
	 }
	 curr.next=curr.next.next;
	 curr.next.prev=curr;
	 count--;
 }
}

public class DSA_01_List_DoubleLinkedList {
	public static void main(String[] args) {
		DoubleLinkedList dl=new DoubleLinkedList();
		dl.add(10);
		dl.add(20);
		dl.add(30);
		dl.add(40);
		dl.add(50);
		dl.remove(4);
//		System.out.println(dl.size());
//		System.out.println(dl.isEmpty());
		dl.addPos(50, 4);
//		System.out.println(dl.get(4));
		dl.display();
//		dl.remove(5);
//		System.out.println("==========");
//		dl.reverseDisplay();
	}
}

