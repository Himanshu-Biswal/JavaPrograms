package D.S.A;
class Md{
	int count=0;
	Node2 head;
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
		count++;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
}
public class D{
	 public static void main(String[] args) {
		Md m=new Md();
		m.add(1);
		m.add(2);
		m.add(3);
		m.add(4);
		m.add(5);
		System.out.println(m.size());
//		m.remove(4);
//		System.out.println(m.size());
//		m.addPos(5, 2);
//////		System.out.println(m.size());
//		m.display();
	}
 }
