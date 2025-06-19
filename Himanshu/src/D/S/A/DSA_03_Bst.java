package D.S.A;
import java.util.LinkedList;
import java.util.Queue;

 class BinarySearchTree {
 BstNode root;
 int count=0;
 boolean flag=true;
 public boolean add(int key) {
	 root=add(key,root);
	 return flag;
 }
private BstNode add(int key , BstNode n) {
	if(n==null) {
		n=new BstNode(key);
		count++;
		return n;
	}
	if(key<n.key) n.left=add(key,n.left);
	else if(key>n.key) n.right=add(key,n.right);
	else flag=false;
	
	return n;
}
public int size() {
	 return count;
 }
 public boolean isEmpty() {
	 return count==0;
 }
 public void Inorder() {
	 Inorder(root);
 }
 public void Inorder(BstNode n) { //left,key,right
	 if(n==null)
		 return;
	 Inorder(n.left);
	 System.out.println(n.key);
	 Inorder(n.right);
 }
 
 public void Preorder() {
	 Inorder(root);
 }
 public void Preorder(BstNode n) { //key,left,right
	 if(n==null)
		 return;
	 System.out.println(n.key);
	 Preorder(n.left);
	 Preorder(n.right);
 }
 
 public void Postorder() {
	 Inorder(root);
 }
 public void Postorder(BstNode n) { //left,right,key
	 if(n==null)
		 return;
	 Postorder(n.left);
	 Postorder(n.right);
	 System.out.println(n.key);
 }
 //LevelOrder
 public void levelOrder() {
	 Queue<BstNode> q=new LinkedList<>();
	 if(root!=null) {
		 q.add(root);
		 while(!q.isEmpty()) {
			 BstNode n=q.poll();
			 System.out.println(n.key);
			 if(n.left!=null) q.add(n.left);
			 if(n.right!=null) q.add(n.right);
		 }
	 }
 }
 //Remove
 public void remove(int key) {
	 remove(key, root);
 }
 public BstNode remove(int key,BstNode n) {
	 if(n==null) return null;
	 if(key<n.key) n.left=remove(key,n.left);
	 else if(key>n.key) n.right=remove(key, n.right);
	 else {
		 if(n.left==null) {
		 	 count--;
			 return n.right;
		 }
		 else if(n.right==null) {
			 count--;
			 return n.left;
		 }
		 else {
			 n.key=getMin(n.right);
			 n.right=remove(n.key, n.right);
		 }
	 }
	 return n;
 }
 public int getMin(BstNode n) {
	 int min=n.key;
	 while(n.left!=null) {
		 min=n.left.key;
		 n=n.left;
	 }
	 return min;
  }
}
 
 public class DSA_03_Bst{
	 public static void main(String[] args) {
		 BinarySearchTree b=new BinarySearchTree();
		 b.add(80);
		 b.add(50);
		 b.add(52);
		 b.add(60);
		 b.add(40);
		 b.add(55);
		 b.add(85);
		 b.add(100);
		 b.levelOrder();
		 b.remove(50);
		 System.out.println("=========");
		 b.levelOrder();
		 System.out.println(b.size());
		 
	}
 }
