package Serialization;

public class Clonning {
 public static void main(String[] args) throws CloneNotSupportedException {
	Person p1=new Person("hianshu",25,new Address("bbsr","Odisha"));
	Person p2=(Person) p1.clone();
	System.out.println(p1);
	System.out.println(p2);
	System.out.println("==========");
	p2.address.city="blr";
	System.out.println(p1);
	System.out.println(p2);
 }
}
