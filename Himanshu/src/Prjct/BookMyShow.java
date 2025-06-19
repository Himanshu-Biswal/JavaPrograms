package Prjct;

public class BookMyShow {
 public static void main(String[] args) {
	Theater t1= Theater.getInstance();
	t1.display(70);
	Theater t2=Theater.getInstance();
	t2.display(30);
	Theater t3=Theater.getInstance();
	t3.display(10);
}
}
