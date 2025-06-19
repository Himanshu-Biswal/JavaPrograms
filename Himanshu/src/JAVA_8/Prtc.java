package JAVA_8;

import java.util.function.Supplier;
@FunctionalInterface
interface Get<s>{
	s get(int age,int sal);
}
class Abc{
	int age;
	int sal;
	public Abc(int age, int sal) {
		super();
		this.age = age;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Abc [age=" + age + ", sal=" + sal + "]";
	}
	
}
public class Prtc {
//	public int sum(int a,int b) {
//		return a+b;
//	}
 public static void main(String[] args) {
	Get<Abc> s = Abc::new;
	Abc a =s.get(7, 66);
	System.out.println(a);
}
}
