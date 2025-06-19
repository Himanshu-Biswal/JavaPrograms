package Binding;

public class CallDriver {
 public static void main(String[] args) {
	Driver.drive(new Bmw());
	System.out.println("====================================");
	Driver.drive(new Audi());
  System.out.println("====================================");
	Driver.drive(new Prosche());
}
}
