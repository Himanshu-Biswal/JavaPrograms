package OOPS;
 class C{
//	static int i=9;
	int i=9;
	void m1() {
		System.out.println(i);
	}
}

public class Text1 {
 public static void main(String[] args) {
	C c=new C();
	C c1=new C();
	
	c.i=7;
	c1.i=8;

	c.m1();
	c1.m1();
}
}
