package Serialization;

public class Person implements Cloneable {
 String name;
 int age;
 Address address;
public Person(String name, int age,Address address) {
	super();
	this.name = name;
	this.age = age;
	this.address=address;
}

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
}

@Override
public Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	Person p = (Person) super.clone();
	p.address=(Address) address.clone();
	return p;
//	return super.clone();
}
 
}
