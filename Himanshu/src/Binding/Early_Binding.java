package Binding;
class AA{
	static void m1() {
		System.out.println("m1()-A");
	}
}

class BB extends AA{

	static void m1() {
		System.out.println("m1()-B-A");
	}
	
	static void m1(int n) {
		System.out.println("m1(7)-B-A");
	}
	
	
//	void m2() {
//		System.out.println("m2()-B");
//	}
}
public class Early_Binding {
 public static void main(String[] args) {
//	 BB a = new BB();
//		a.m1();          //Early-BINDING       
//		a.m1(7);
}
}
