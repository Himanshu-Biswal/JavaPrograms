package NonPrimitiveTypeCasting;
class A{
	void m1() {
		System.out.println("A");
	}
}

class B extends A{
	void m2() {
		System.out.println("B");
	}
}


public class Upcasting_1 {
  public static void main(String[] args) {
	B b=new B();
//	A a=new A();           
//	A a=b;             UPCASTING
	A a=(A)b;     //   UPCASTING
	b.m1();
	b.m2();
	System.out.println("-------------------------");
	a.m1();
//	a.m2();    COMPILETIME ERROR
}
}
