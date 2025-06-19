package Prjct;

 class A {
	 
		private static A a;
		
		private A() { }
		
		public static A getIns() {
			if(a==null) {
				a=new A();
				return a;
			}
			else return a;
			
		}
	}

public class SingleTonClass{
	public static void main(String[] args) {
		A a1=A.getIns();
		A a2=A.getIns();
		A a3=A.getIns();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
}
}