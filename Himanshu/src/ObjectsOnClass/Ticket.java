package ObjectsOnClass;



public class Ticket {
  static Ticket t;
  private Ticket() {}
  private static int seats=100;
  
  static Ticket get() {
	  if(t==null) {
		  t=new Ticket();
		  return t;
	  }
	  else return t;
  }
  
  public  void bookTicket(int n) {
	  
	  if(n>seats) {
		  System.out.println(n+" seats are not available");
		  System.out.println("Now "+seats+" are availble");
		  System.out.println("You can book "+seats+" tickets now");
	  }
	  
	  else {
		  seats-=n;
		  System.out.println(n+" seats are booked");
		  System.out.println("Now "+seats+" are availble");
	  }
  }
}
