package Binding;
class Animal{
	void makeSound() {
		System.out.println("Animal-Sound");
	}
}

class Dog extends Animal{
@Override
	void makeSound() {
		System.out.println("Dog-Sound");
	}
}

class BabyDog extends Animal{
	@Override
	void makeSound() {
		System.out.println("BabyDog-Sound");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("Cat-Sound");
	}
}

public class Late_Binding_1 {
 public static void main(String[] args) {
	Animal a = new Animal();
	a.makeSound();
	a=new Dog();
	a.makeSound();
	
	a=new BabyDog();
	a.makeSound();
	
	a=new Cat();
	a.makeSound();
}
}
