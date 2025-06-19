package Prjct;

public class Mobile {
  String MobileName;
  int ram;
  int rom;
  String Color;
  Sim s;
  
  public Mobile(String MobileName,int ram,int rom,String Color) {
	  this.MobileName=MobileName;
	  this.ram=ram;
	  this.rom=rom;
	  this.Color=Color;
  }
  
  public void insertSim(Sim s) {
	  this.s=s;
  }
  
  public void displayMobile() {
	  System.out.println("Mobile Name:"+MobileName);
	  System.out.println("Mobile ram:"+ram);
	  System.out.println("Mobile rom:"+rom);
	  System.out.println("Mobile color:"+Color);
	  
   if(s!=null) s.display();
   else System.out.println("Sim Card Not Inserted");
  }
}
