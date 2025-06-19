package Binding;
class AAA{
	
}

class BBB extends AAA{
	
}

class C{
	void m1(AAA a) {
		System.out.println("m1(A-a)-C");
	}

	 void m1(BBB b) {
		// TODO Auto-generated method stub
		System.out.println("m1(BB-b)-D");
	}
}
	
	class D extends C{
		@Override
		void m1(AAA a) {
			System.out.println("m1(A-a)-D");
		}
		@Override
		 void m1(BBB b) {
			System.out.println("m1(BB-b)-D");
		}
		
	}
public class MixBindingExample {
 public static void main(String[] args) {
	AAA a=new BBB();
	BBB b=new BBB();
	
	AAA i=new BBB();
	
	C c=new D();
	
	c.m1(a);
	c.m1(b);
	c.m1(i);
}
}
