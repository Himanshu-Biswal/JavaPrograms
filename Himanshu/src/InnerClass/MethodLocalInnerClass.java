package InnerClass;

public class MethodLocalInnerClass {
 public static void main(String[] args) {
	class A{
		void add(int a,int b) {
			System.out.println(a+"+"+b+"="+(a+b));
		}
	}
	A a=new A();
	a.add(4, 3);
}
}
