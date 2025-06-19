package JAVA_8;

import java.util.function.Supplier;

class Cnr{
	Cnr(){
		System.out.println("No-Argument Constructor");
	}
}
public class Java_08_11_NoArgu_Constructor_Reference {
 public static void main(String[] args) {
	Supplier<Cnr> s = Cnr::new;
	Cnr c1=s.get();
	s.get();
	System.out.println(c1);
}
}
