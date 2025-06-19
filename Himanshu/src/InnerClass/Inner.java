package InnerClass;

public class Inner {
	static int i=7;
	int j=8;
 class A{
	 int i=9;
	 void m1() {
		 System.out.println("Inner Static Class i: "+i);
		 System.out.println("Outter Class i: "+Inner.i);
		 System.out.println("Outter Class j: "+new Inner().j);
	 }
	 public static void main(String[] args) {
		System.out.println("Inner Class");
	}
 }
 public static void main(String[] args) {
	Inner i=new Inner();
	Inner.A a=i.new A();
	Inner.A b=new Inner().new A();
	a.m1();
	System.out.println("=========");
	b.m1();
}
}
