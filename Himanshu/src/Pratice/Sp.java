package Pratice;

class Reactangle{
	int length;
	int breadth;
	 Reactangle(int l,int b) {
		length=l;
		breadth=b;
	}
	Reactangle(Reactangle r){
		length=r.length;
		breadth=r.breadth;
	}
	void display(Reactangle r) {
		System.out.println("Length: "+r.length+",Breadth: "+r.breadth);
	}
}
public class Sp {
 public static void main(String[] args) {
	 Reactangle r1=new Reactangle(10,20);
	 Reactangle r2=new Reactangle(30,40);
	 r1.display(r1);
	 r2.display(r2);
 }
}
