package ExceptionHandeling;

public class Exception_04_Exception_Propagation {
	static void m1() {
		System.out.println("m1-starts");
		m2();
		System.out.println("m1-ends");
	}
	static void m2() {
		System.out.println("m2-starts");
		System.out.println(10/0);
		System.out.println("m2-ends");
	}
 public static void main(String[] args) {
	 System.out.println("main-starts");
	try {
		m1();
	}catch (ArithmeticException e) {
		System.out.println();
	}
	System.out.println("main-ends");
}
}
