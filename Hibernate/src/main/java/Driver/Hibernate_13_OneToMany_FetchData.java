package Driver;

import java.util.List;

import Entity.Account;
import Entity.Bank;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Hibernate_13_OneToMany_FetchData {
  public static void main(String[] args) {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("Himanshu");
   	  System.out.println(emf);
	  EntityManager manager = emf.createEntityManager();
	  System.out.println(manager);
	  
	  Bank b = manager.find(Bank.class, 1);
	  
	  if(b!=null) {
		  System.out.println("Bank Details");
		  System.out.println(b.getbId()+":"+b.getbName()+":"+b.getIfsc());
		  
		  System.out.println("=====================");
		  
		  List<Account> account = b.getAccout();
		  System.out.println(b.getbName()+" Have These Details");
		  if(account!=null) {
			  for(Account a:account) {
				  System.out.println(a.getaId()+":"+a.getuName()+":"+a.getBal());
			  }
		  }
	  }
		
}
}
