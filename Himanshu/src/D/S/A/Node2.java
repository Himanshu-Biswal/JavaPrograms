package D.S.A;
//DoubleLinkedList & Queue
public class Node2 {
 Node2 prev;
 Object ele;
 Node2 next;
 Node2(Object ele){
	 this.ele=ele;
 }
 Node2(Node2 prev,Object ele,Node2 next){
	 this.prev=prev;
	 this.ele=ele;
	 this.next=next;
 }
}
