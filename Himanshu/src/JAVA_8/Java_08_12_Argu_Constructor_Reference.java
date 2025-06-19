package JAVA_8;
@FunctionalInterface
interface GetInt<t> {
	t get(String n,int a);
}
class Cn{
	String n;
	int a;
	Cn(String n,int a){
		this.n=n;
		this.a=a;
	}
	public String toString() {
		return "Name: "+n+"  Age: "+a;
	}
}
public class Java_08_12_Argu_Constructor_Reference {
 public static void main(String[] args) {
	GetInt<Cn> s = Cn::new;
	Cn c1 = s.get("Himanshu", 25);
	System.out.println(c1);
}
}

