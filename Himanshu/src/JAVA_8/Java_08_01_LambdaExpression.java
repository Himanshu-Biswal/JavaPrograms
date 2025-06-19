package JAVA_8;
@FunctionalInterface
interface I{
	void m1(int i); // Int to Char
//	void m1(char i);// Char to Int
//	void m1(int i,int j);
//	int m1(int i,int j);
}
public class Java_08_01_LambdaExpression {
 public static void main(String[] args) {
	 I i=a->System.out.println((char)a);
//	 I i=a->System.out.println((int)a);
	 i.m1(65);
//	I i=(a,b)->System.out.println(a+"+"+b+" = "+(a+b));
//	 I i=(a,b)->a+b;
//	 I i=(a,b)->{return a+b;};
//	System.out.println(i.m1(4, 3));
}
}
