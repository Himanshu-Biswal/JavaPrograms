package Binding;

public class Car {
 void st() {
	 
 }
 
 void acc() {
	 
 }
 
 void stop() {
	 
 }
}

class Bmw extends Car{
	@Override
	void st() {
		 System.out.println("Bmw-Start");
	 }
	 @Override
	 void acc() {
		 System.out.println("Bmw-Accelerate");		    
	 }
	 @Override
	 void stop() {
		 System.out.println("Bmw-Stop");		 
	 }
}

class Audi extends Car{
	 @Override
	void st() {
		 System.out.println("Audi-Start");
	 }
	 @Override
	 void acc() {
		 System.out.println("Audi-Accelerate");
	 }
	 @Override
	 void stop() {
		 System.out.println("Audi-Stop");
	 }
}

class Prosche extends Car{
	 @Override
	void st() {
		 System.out.println("Porsche-Start");
	 }
	 @Override
	 void acc() {
		 System.out.println("Porsche-Accelerate");
	 }
	 @Override
	 void stop() {
		 System.out.println("Porsche-Stop");
	 }
}


class Driver{
	static void drive(Car c) {
		c.st();
		c.acc();
		c.stop();
	}
}
