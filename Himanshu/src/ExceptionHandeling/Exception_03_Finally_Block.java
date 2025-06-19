package ExceptionHandeling;

public class Exception_03_Finally_Block {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		try {
			System.out.println(a[5]/0);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("outer-catch");
		}
		finally {
			System.out.println("Finally-Block");
		}
	}
}
