  package CollectionFrameWork;

import java.util.Arrays;

class Emp implements Comparable<Emp>{
     String name;
     int age;
     int id;
    public Emp(String name, int age,int id) {
        this.name = name;
        this.age = age;
        this.id=id;
    }

    // toString method for easy display
    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + " ,Id"+id+"}";
    }

	@Override
	public int compareTo(Emp o) {
		return this.age-o.age;
	}

//	@Override
//	public int compareTo(Object o) {
//		return this.age-((Emp)o).age;
//	}  //FOR NON-GENERIC TYPE
    
   
}
public class Collection_05_Comparable {
 public static void main(String[] args) {
	 Emp e1=new Emp("Himanshu", 24, 7);
	 Emp e2=new Emp("Sudha", 21, 9);
	 Emp e3=new Emp("Ashish", 23, 8);
	 Emp e4=new Emp("Sager", 21, 3);
	 Emp e5=new Emp("Madhu", 22, 33);
	 
	 Emp[] e= {e1,e2,e3,e4,e5};
	 
	 Arrays.sort(e);
	 for(Emp emp:e) {
		 System.out.println(emp);
	 }
}
}
