package ObjectsOnClass;
class Circle{
	int radius;
	
	Circle(int r){
		radius=r;
	}
	
	void m1(Circle c) {
		System.out.println(radius);
		System.out.println(c.radius);
		System.out.println("----------------------------");
	}
}


public class Text3 {
 public static void main(String[] args) {
	Circle c1=new Circle(7);
	Circle c2=new Circle(8);
	c1.m1(c2);
	c2.m1(c1);
	c1.m1(c1);
	c2.m1(c2);
}
}
