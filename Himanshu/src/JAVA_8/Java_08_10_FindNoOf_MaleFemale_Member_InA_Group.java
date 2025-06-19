package JAVA_8;

import java.util.Arrays;
import java.util.List;

class Emp3{
	String name;
	int sal;
	String gender;
	Emp3(String name,int sal,String gender){
		this.name=name;
		this.sal=sal;
		this.gender=gender;
	}
	
	@Override
	public String toString() {
		return "[ Name :"+name+" , Salary :"+sal+" Gender :"+gender+" ]";
	}
}
public class Java_08_10_FindNoOf_MaleFemale_Member_InA_Group {
 public static void main(String[] args) {
	Emp3 e1 = new Emp3("Himanshu", 24, "Male");
	Emp3 e2 = new Emp3("Madhu", 22, "FeMale");
	Emp3 e3 = new Emp3("Chandan", 29, "Male");
	Emp3 e4 = new Emp3("Karan", 23, "Male");
	Emp3 e5 = new Emp3("Salu", 21, "FeMale");
	
	Emp3[] e= {e1,e2,e3,e4,e5};
	
	List<Emp3> emp = Arrays.asList(e);
	
	long f = emp.stream().filter(em->em.gender=="FeMale").count();
	long m=e.length-f;
	System.out.println("No of Male: "+m+", No of Female :"+f);
}
}
