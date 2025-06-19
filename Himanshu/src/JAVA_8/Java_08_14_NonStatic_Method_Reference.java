package JAVA_8;
@FunctionalInterface
interface Nst{
	public void add(int a,int b);
}
public class Java_08_14_NonStatic_Method_Reference {
	  void m1(int a,int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}
 public static void main(String[] args) {
	 Java_08_14_NonStatic_Method_Reference ns = new Java_08_14_NonStatic_Method_Reference();
	St s = ns::m1;
     s.add(4, 3);	
 }
}
