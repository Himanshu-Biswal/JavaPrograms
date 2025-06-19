package Prjct;

public class Car {
 String carName;
 String color;
 int carNum;
 Engine e;
 
 public Car(String carName, String color,int carNum,Engine e) {
	 this.carName=carName;
	 this.color=color;
	 this.carNum=carNum;
	 this.e=e;
 }
 
 public void carDisplay() {
	 System.out.println("Car Name: "+carName);
	 System.out.println("Car Color: "+color);
	 System.out.println("Car Num: "+carNum);
	 e.display();
 }
}
