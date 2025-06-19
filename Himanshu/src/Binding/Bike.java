package Binding;
import java.util.Scanner;
public class Bike{
	void st() {
		
	}
	
	void acc() {
		
	}
	
	void stop() {
		
	}
}

class Ktm extends Bike{
void st() {
		System.out.println("Ktm-Start");
	}
	
	void acc() {		System.out.println("Ktm-Accelerate");
	}
	
	void stop() {
		System.out.println("Ktm-Stop");
	}
	
	void gear5() {
		System.out.println("Ktm-gear");
	}
}

class Bullet extends Bike{
	void st() {
		System.out.println("Bullet-Start");
	}
	
	void acc() {
		System.out.println("Bullet-Accelerate");
	}
	
	void stop() {
		System.out.println("Bullet-Stop");
	}
	
	void flexible() {
		System.out.println("Bullet-Flexibility");
	}
}

class Mt extends Bike{
	void st() {
		System.out.println("Mt-Start");
	}
	
	void acc() {
		System.out.println("Mt-Accelerate");
	}
	
	void stop() {
		System.out.println("Mt-Stop");
	}
	
	
	void Look() {
		System.out.println("Mt-Look");
	}
}

class BikeSelecter{
	static Bike select() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("1.Ktm\n2.Bullet\n3.Mt\n4.Null");
			int n=s.nextInt();
			
			if(n==1) {
				return new Ktm();
			}
			else if(n==2) {
				return new Bullet();
			}
			else if(n==3) {
				return new Mt();
			}
			
			else {
				System.out.println("Invalid Input");
				return null;
				
			}
		}
		
		
	}
	
	static void drive(){
		Bike b=BikeSelecter.select();
		b.st();
		b.acc();
		if(b instanceof Ktm) {
			Ktm k=new Ktm();
			k.gear5();
		}
		
		if(b instanceof Bullet) {
			Bullet b1=new Bullet();
			b1.flexible();
		}
		
		if(b instanceof Mt) {
			Mt m=new Mt();
			m.Look();
		}
		
		b.stop();
	}
	
}

