package Prjct;

public class CarDriver {
 public static void main(String[] args) {
	Car c=new Car("Defender", "Black", 7777, new Engine(500,"Petrol"));
	c.e.cc=1000;
	c.color="Grey";
	c.carDisplay();
}
}
