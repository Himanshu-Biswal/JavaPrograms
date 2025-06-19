package Pratice;

public class Node {
//  Object ele;
//  Node next;
////  Node prev;
//  Node(Object ele){
//	  this.ele=ele;
//  }
//  Node(Object ele,Node next){
//	  this.ele=ele;
//	  this.next=next;
////	  this.prev=prev;
//  }
	
	int key;
	Node left;
	public Node(int key) {
		super();
		this.key = key;
	}
	Node right;
	public Node(int key, Node left, Node right) {
		super();
		this.key = key;
		this.left = left;
		this.right = right;
	}
	
}
