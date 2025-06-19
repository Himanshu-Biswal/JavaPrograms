package Aa_Interview_Question;
//Base class
class Animal {
 void speak() {
     System.out.println("Some sound");
 }
}

//Subclass Dog
class Dog extends Animal {
 @Override
 void speak() {
     System.out.println("Woof!");
 }
}

//Subclass Cat
class Cat extends Animal {
 @Override
 void speak() {
     System.out.println("Meow!");
 }
}

//Main class
public class PolymorphismExample {
 public static void main(String[] args) {
     Animal myAnimal; // Declare a reference of type Animal

     myAnimal = new Dog();  // Dog is an Animal
     myAnimal.speak();      // Output: Woof!

     myAnimal = new Cat();  // Cat is an Animal
     myAnimal.speak();      // Output: Meow!
 }
}

