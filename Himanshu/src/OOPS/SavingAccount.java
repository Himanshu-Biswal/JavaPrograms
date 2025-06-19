package OOPS;
import java.util.Scanner;

class Details{
	double bal;
	
	void currentBal() {
		System.out.println("current Balance"+bal);
	}
	
	void withdrawn(int amt) {
		if(amt>bal)
			System.out.println("failed,less fund");
		bal=bal-amt;
		System.out.println("balance after withdrwan"+bal);
//		currentBal();
	}
}
public class SavingAccount {
  public static void main(String[] args) {
	Details d1=new Details();
	d1.bal=10000;
	
	
//	Details d2=d1;
//	d2.bal=200000;
//	System.out.println(d2.bal);
	
	
	d1.currentBal();
	System.out.println("enter withdrwan amount");
	@SuppressWarnings("resource")
	int amt = new Scanner(System.in).nextInt();
	d1.withdrawn(amt);
//	amt.close();
}
}
