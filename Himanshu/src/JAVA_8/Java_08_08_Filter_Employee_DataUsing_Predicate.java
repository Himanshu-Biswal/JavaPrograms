package JAVA_8;

import java.util.function.Predicate;

class Employee{
    String name;
    int sal;
    int id;
   public Employee(String name, int sal,int id) {
       this.name = name;
       this.sal = sal;
       this.id=id;
   }

   // toString method for easy display
   @Override
   public String toString() {
       return "Employee{name='" + name + "', Sal=" + sal + " ,Id"+id+"}";
   }
}
public class Java_08_08_Filter_Employee_DataUsing_Predicate {
 public static void main(String[] args) {
	 Employee e1=new Employee("Himanshu", 24000, 7);
	 Employee e2=new Employee("Sudha", 21000, 9);
	 Employee e3=new Employee("Ashish", 23000, 8);
	 Employee e4=new Employee("Sager", 21000, 3);
	 Employee e5=new Employee("Madhu", 18000, 33);
	 
	 Employee[] e= {e1,e2,e3,e4,e5};
	 
	 Predicate<Employee> p=emp->emp.sal<20000;
	 for(Employee em:e) {
		if(p.test(em)) System.out.println(em);
	 }
	 
}
}
