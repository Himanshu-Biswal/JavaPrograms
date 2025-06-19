package Prjct;

public class Engine {
 int cc;
 String type;
 
 public Engine(int cc,String type) {
	 this.cc=cc;
	 this.type=type;
 }
 
 public void display() {
	 System.out.println("Engine cc: "+cc);
	 System.out.println("Engine type: "+type);
 }
}
