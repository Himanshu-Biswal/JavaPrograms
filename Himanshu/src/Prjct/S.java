package Prjct;
class C{
	private static C a;
	
	private C() {}
	
	public static C get() {
		if(a==null) {
			a=new C();
			return a;
		}
		else return a;
		
	}
}
public class S {
    public static void main(String[] args) {
		C a= C.get();
		C b=C.get();
		System.out.println(a);
		System.out.println(b);
	}
}
