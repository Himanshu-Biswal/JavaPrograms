package CollectionFrameWork;

@SuppressWarnings("rawtypes")
public class Collection_04_Comparable_Student implements Comparable {
 String sname;
 int age;
 int mark;
 Collection_04_Comparable_Student(String sname,int age,int mark){
	 this.sname=sname;
	 this.age=age;
	 this.mark=mark;
 }
 @Override
	public String toString() {
		return "[ Student Name: "+sname+"\n  Student Age: "+age+
				"\n  Student Mark: "+mark+" ]";
	}
 @Override
 public int compareTo(Object o) {
// Object s=(Collection_04_Comparable_Student)o;//Downcasting
	 return this.age-((Collection_04_Comparable_Student)o).age;
 }
} 
