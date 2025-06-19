package D.S.A;
//add,size,isEmpty,display,contains,remove
 class Hashset {
 int count=0;
 Node a[]=new Node[10];
 
 public boolean add(Object ele) {
	 int hc=Math.abs(ele.hashCode());
	 int index=hc%a.length;
	 if(a[index]==null) {
		 a[index]=new Node(ele);
		 count++;
		 return true;
	 }
	 Node curr=a[index];
	 while(curr.next!=null) {
		 if(curr.ele.equals(ele))
			 return false;
		 curr=curr.next;
	 }
	 curr.next=new Node(ele);
	 count++;
	 return true;
 }
 public int size() {
	 return count;
 }
 public boolean isEmpty() {
	 return count==0;
 }
 public void display() {
	 for(int i=0;i<a.length;i++) {
		 Node curr=a[i];
		 while(curr!=null) {
			 System.out.println(curr.ele);
			 curr=curr.next;
		 }
	 }
 }
 
 public boolean contains(Object ele) {
	 int hc=Math.abs(ele.hashCode());
	 int index=hc%a.length;
	 Node curr=a[index];
	 while(curr!=null) {
		 if(curr.ele.equals(ele)) return true;
		 curr=curr.next;
	 }
	 return false;
 }
 public boolean remove(Object ele) {
	 int hc=Math.abs(ele.hashCode());
	 int index=hc%a.length;
	 Node prev=null;
	 Node curr=a[index];
	 while(curr!=null) {
		 if(curr.ele.equals(ele)) {
			 if(prev==null) {
				 a[index]=a[index].next;
				 count--;
				 return true;
			 }
			 prev.next=prev.next.next;
			 count--;
			 return true;
		 }
		 prev=curr;
		 curr=curr.next;
	 }
	 return false;
 }
}
 public class DSA_02_Set_HashSet{
	 public static void main(String[] args) {
		Hashset h=new Hashset();
		h.add("one");
		h.add("two");
		h.add("three");
		h.add("four");
		h.add("five");
//		System.out.println(h.contains("Himanshu"));
		h.display();
		System.out.println("=========");
		h.remove("two");
		h.display();
	}
 }
