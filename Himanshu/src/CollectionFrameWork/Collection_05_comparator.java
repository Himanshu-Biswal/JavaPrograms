
package CollectionFrameWork;

import java.util.Arrays;
import java.util.Comparator;

class Team {
     String name;
     int age;
     int id;
    public Team(String name, int age,int id) {
        this.name = name;
        this.age = age;
        this.id=id;
    }

    // toString method for easy display
    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + " ,Id"+id+"}";
    }
}

class SortByAge implements Comparator<Team>{

	@Override
	public int compare(Team o1, Team o2) {
		return o1.age-o2.age;
	}
	
}
public class Collection_05_comparator {
 public static void main(String[] args) {
	 Team e1=new Team("Himanshu", 24, 7);
	 Team e2=new Team("Sudha", 21, 9);
	 Team e3=new Team("Ashish", 23, 8);
	 Team e4=new Team("Sager", 21, 3);
	 Team e5=new Team("Madhu", 22, 33);
	 
	 Team[] e= {e1,e2,e3,e4,e5};
	 
	 Arrays.sort(e,new SortByAge());
	 for(Team emp:e) {
		 System.out.println(emp);
	 }
}
}

