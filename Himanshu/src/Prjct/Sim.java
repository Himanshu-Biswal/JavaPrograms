package Prjct;

//import java.math.BigInteger;

public class Sim {
 long num;
 String sName;
 
 public Sim (long num,String sName) {
	 this.num=num;
	 this.sName=sName;
 }
 public void display() {
	 System.out.println("Mobile-Number:"+num+"\n"+"Sim Name:"+sName);
 }
}
