package ObjectsOnClass;
class Bike{
	String color;
	 Bike(String c){
		 color=c;
	 }
}

class Garage{
	void changeColor(Bike b) {
		b.color="red";
	}
}
public class Text2 {
 public static void main(String[] args) {
	Bike b=new Bike("Black");
	System.out.println(b.color);
	Garage g=new Garage();
	g.changeColor(b);
	System.out.println(b.color);
}
}
