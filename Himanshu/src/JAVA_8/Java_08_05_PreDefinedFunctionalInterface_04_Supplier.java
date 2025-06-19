package JAVA_8;

import java.util.function.Supplier;

class Emp2{
	String name;
	int id;
	int sal;
	
	public Emp2(String name,int sal, int id) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	 public String toString() {
	       return "Employee{name='" + name + "', Sal=" + sal + " ,Id="+id+"}";
	   }

}
public class Java_08_05_PreDefinedFunctionalInterface_04_Supplier {
 public static void main(String[] args) {
	Supplier<Emp2> s = ()->new Emp2("Madhusmita", 20000, 22); //DataType
	System.out.println(s.get());
}
}
