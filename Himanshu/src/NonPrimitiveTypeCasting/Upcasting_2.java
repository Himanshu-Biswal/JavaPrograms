package NonPrimitiveTypeCasting;
   
class AA{
	 int i=7;
	static void m1() {
		System.out.println("A-m1()");
	}
//	static void m1(int a) {
//		System.out.println("A-m1(a)"+a);
//	}
}

class BB extends AA{
	static int i=9;
	static void m1() {
		System.out.println("A-m1()");
	}
	static void m1(int a) {
		System.out.println("A-m1(a)"+a);
	}
}
public class Upcasting_2 {
 public static void main(String[] args) {
  AA.m1();
  BB.m1(0);
  AA b=new BB();
  System.out.println(b.i+"  ");
}
}
