package InnerClass;

public class Nested {
	static int i=7;
	int j=8;
 static class I{
	 int i=9;
	void m1() {
		System.out.println("Inner Static Class i: "+i);
		System.out.println("Outter Class i: "+Nested.i);
		System.out.println("Outter Class j: "+new Nested().j);
	}
	public static void main(String[] args) {
		System.out.println("Inner");
	}
 }
 public static void main(String[] args) {
	I i=new I();
	i.m1();
}
}
