package OOPS;



class Dmo{
	double bal;
}
public class Null {
 public static void main(String[] args) {
	Dmo d=new Dmo();
	d.bal=2000;
	System.out.println(d.bal);
//	 Dmo e=d;
	Dmo e = new Dmo();
	 e.bal=1000;
//	 System.out.println(e.bal);
//	 System.out.println(d.bal);
}
}
