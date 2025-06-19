package Serialization;
 import java.io.Serializable;
@SuppressWarnings("serial")
public class Student implements Serializable {
	String name;
	int age;
	int id;
	long mobile;
	
	public Student(String name,int age,int id,long mobile){
		this.name=name;
		this.age=age;
		this.id=id;
		this.mobile=mobile;
	}


	@Override
	public String toString() {	
		return "Student[ name: "+name+" id: "+id+" age: "+age+" mobile: "+mobile+" ]";
	}
}
