package D.S.A;

public class BstNode {
 BstNode left;
 int key;
 BstNode right;
 BstNode(int key){
	 this.key=key;
 }
 BstNode(BstNode left,int key,BstNode right){
	 this.left=left;
	 this.key=key;
	 this.right=right;
 }
}
