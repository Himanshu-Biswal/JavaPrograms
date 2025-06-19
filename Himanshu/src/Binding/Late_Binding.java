package Binding;
class A{
	void m1() {
		System.out.println("m1()-A");
	}
}

class B extends A{
	@Override
	void m1() {
		System.out.println("m1()-B-A");
	}
	
	void m2() {
		System.out.println("m2()-B");
	}
}
public class Late_Binding {
  public static void main(String[] args) {
	A a = new B();
	a.m1();          //LATE-BINDING       
//	B b = new B();
//	b.m1();          //LATE-BINDING         
//	b.m2();
}
}
