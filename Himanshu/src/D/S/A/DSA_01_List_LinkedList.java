package D.S.A;

class LinkedList1 {
 Node head;
 int count=0;
 public void add(Object ele) {
	 if(head==null) {
		 head=new Node(ele);
		 count++;
		 return;
	 }
	 Node current=head;
	 while(current.next!=null) {
		 current=current.next;
	 }
	 current.next=new Node(ele,null);
	 count++;
 }
 public int size() {
	 return count;
 }
 public Object get(int index) {
	 if(index<0 || index>=size()) 
		 throw new IndexOutOfBoundsException();
	 Node current=head;
	 for(int i=0;i<index;i++) {
	    current=current.next;
	 }
	 return current.ele;
 }
 public void addPos(Object ele,int index) {
	 if(index<0 || index>size())
		 throw new IndexOutOfBoundsException();
	 if(index==0) {
		 addFirst(ele);
//		 Node n=new Node(ele);
//			n.next=head;
//			head=n;
//			count++;
		 return;
	 }
	 Node n=new Node(ele);
	 Node curr=head;
	 for(int i=1;i<index;i++) {
		 curr=curr.next;
	 } 
	 n.next=curr.next;// Correctly linking new node
	 curr.next=n;
	 count++;
 }
 
private void addFirst(Object ele) {
	Node n=new Node(ele);
	n.next=head;
	head=n;
	count++;
	return;
}
public void display() {
	Node curr=head;
	while(curr!=null) {
		System.out.println(curr.ele);
		curr=curr.next;
	}
}
public void remove(int index) {
	if(index<0 || index>=size())
		 throw new IndexOutOfBoundsException();
	
	if(index==0) {
		head=head.next;
		count--;
		return;
	}
	Node curr=head;
	for(int i=1;i<index;i++) {
		curr=curr.next;
	}
		curr.next=curr.next.next;
		count--;
}
public boolean contains(Object ele) {
	Node curr=head;
	while(curr!=null) {
		if(curr.ele.equals(ele))
			return true;
		curr=curr.next;
	}
	return false;
}
}
public class DSA_01_List_LinkedList{
	public static void main(String[] args) {
		LinkedList1 l= new LinkedList1();
		l.add(1);
		l.add("Mahi");
		l.add("Thala");
//		l.remove(2);
		l.addPos(7, 0);

		System.out.println(l.contains("Thal"));
		l.display();
	}
}

