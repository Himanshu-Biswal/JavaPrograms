package ExceptionHandeling;

public class Exception_02_MultipleException {
 public static void main(String[] args) {
	int a[]= {1,2,3,4};
	try {
		System.out.println("outer-try");
		try {
			System.out.println("inner-try");
			System.out.println(a[5]/0);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("inner-catch");
		}
	}
	catch (ArithmeticException e) {
		System.out.println("outer-catch");
	}
}
}
