package ObjectsOnClass;

class Car{
	static int x=1000;
	int n;
	 Car(){
		 n=x++;
	 }
	 
	 void start() {
		 System.out.println(n+"Starts");
	 }
	 
	 void accelerate() {
		 System.out.println(n+"accelerate");
	 }

	 void end() {
		 System.out.println(n+"end");
	 }


}

class Drivers{
	void driver(Car c) {
		c.start();
		c.accelerate();
		c.end();
		System.out.println("-----------------------");
	}
}
public class Text4 {
 public static void main(String[] args) {
	Car c1=new Car();
	Car c2=new Car();
	Car c3=new Car();
	
	Drivers d=new Drivers();
	
	d.driver(c3);
	d.driver(c2);
	d.driver(c1);
 }
}
