package OOPS;
class X{
int i;
	void m1() {
		int i=5;
		System.out.println(i);
		System.out.println(this.i);
	}
}
public class P {
 public static void main(String[] args) {
    X x=new X();
    X y=new X();
    x.i=10;
    y.i=15;
    x.m1();
    y.m1();
}
}
