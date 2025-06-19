package ObjectsOnClass;
class A{
	int i;
	A(int i){
		this.i=i;
	}
}

class B{
	void display(A args) {
		System.out.println(args.i);
	}
}
public class Text1 {
 public static void main(String[] args) {
	A a=new A(7);
	A a1=new A(70);
	A a2=new A(700);
	System.out.println(a1.i);
	B b=new B();
	b.display(a);
	b.display(a1);
	b.display(a2);
	
}
}
