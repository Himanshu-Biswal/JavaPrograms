package NonStaticTypeCasting;
class Car{
	void makeSound() {
		System.out.println("m1-Animal");
	}
	
	
}
class Bmw extends Car{
	@Override
	void makeSound() {
		System.out.println("m1-Dog");
	}
	
}
class Benz extends Bmw{
	@Override
	void makeSound() {
		System.out.println("m1-BabyDog");
	}
}
public class Upcast {
	public static  Car m1() 
	{
		return new Bmw();
	}
	

	public static  Bmw m2() 
	{	
		return new Benz();
	}
	
	public static  Car m3() 
	{	
		return new Car();
	}
	
	
 public static void main(String[] args) {
//	Animal a=new Animal();
//	a.makeSound();
//	a=new BabyDog();
//	a.makeSound();
//    a=new Dog();
//    a.makeSound();
//    
	 
    
	 Car a1=m1();
	a1.makeSound();
	
	Bmw d=m2();
	d.makeSound();
	
	 Car a=m3 ();
	    a.makeSound();
}
}
