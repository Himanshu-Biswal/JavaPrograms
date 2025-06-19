package OOPS;

class A{
	static int i;
	static int j;
	
	void incr()
	{
		i++;
		j++;
	}
	
	void display() {
		System.out.println(i+" "+j);
	}
	
//	static void m1() {
//		System.out.println(i);
//	}
//	
//	void m2() {
//		System.out.println(i);
//	}
}
public class Pratice {
 public static void main(String[] args) {
//	A a=new A();
//	a.i=7;
//	A.m1();
//	A b=new A();
//	b.i=8;
//	b.m2();
	 
	 A d1=new A();
	 A d2=new A();
	 A d3=new A();
	 
	 d1.incr();
	 d1.display();
	 
	 d2.incr();
	 d2.display();
	 
	 d3.incr();
	 d3.display();
	 
//	 d1.display();
//	 d2.display();
//	 d3.display();
	 
}
}
