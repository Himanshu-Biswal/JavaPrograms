package JAVA_8;
@FunctionalInterface
interface St{
	public void add(int a,int b);
}
public class Java_08_13_Static_Method_Reference {
	 static void m1(int a,int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}
 public static void main(String[] args) {
	St s = Java_08_13_Static_Method_Reference::m1;
     s.add(4, 3);	
 }
}
