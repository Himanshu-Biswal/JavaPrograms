package JAVA_8;

import java.util.function.Function;
import java.util.function.Predicate;

class Emp1{
	String name;
	int id;
	int sal;
	
	public Emp1(String name,int sal, int id) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	 public String toString() {
	       return "Employee{name='" + name + "', Sal=" + sal + " ,Id"+id+"}";
	   }

}
public class Java_08_09_Filter_Employee_DataUsing_Function{
 public static void main(String[] args) {
	Emp1 e1=new Emp1("Himanshu", 25000, 7);
	Emp1 e2=new Emp1("Madhu", 20000, 9);
	Emp1 e3=new Emp1("Ashish", 29000, 8);
	Emp1 e4=new Emp1("Chandan", 280000, 3);
	Emp1 e5=new Emp1("Karan", 250000, 1);
	
	Emp1[] e= {e1,e2,e3,e4,e5};
	
	Predicate<Integer> p = i->i>2000;
	
	Function<Emp1,Integer> fn = i->{
		int bonus;
		if(i.sal<=10000) {
			bonus=(i.sal*30)/100;
			return bonus;
		}
		else if(i.sal>10000 && i.sal<25000) {
			bonus=(i.sal*20)/100;
			return bonus;
		}
		else{
			bonus=(i.sal*10)/100;
			return bonus;
		}
	};
	
	for(Emp1 em:e) {
	  int b=fn.apply(em);
	  if(p.test(b)) {
		  System.out.println(em);
		  System.out.println(b);
	  }
	}
}
}
