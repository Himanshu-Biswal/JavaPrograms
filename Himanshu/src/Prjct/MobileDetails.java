package Prjct;

public class MobileDetails {
 public static void main(String[] args) {
	Mobile m1=new Mobile("IQOO", 8, 256, "Silver");
	
	m1.insertSim(new Sim(773576245,"Jio"));
	m1.s.sName="Airtel";
	m1.displayMobile();
}
}
