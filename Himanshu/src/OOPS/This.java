package OOPS;
class S{
	int i;
	void m1(){
		int i=7;
		System.out.println(i);
		System.out.println(this.i );
	}
}
public class This {
 public static void main(String[] args) {
	S s1=new S();
	s1.i=10;
	
	S s2=new S();
	s2.i=20;

	s1.m1();
	s2.m1();
 }
}


