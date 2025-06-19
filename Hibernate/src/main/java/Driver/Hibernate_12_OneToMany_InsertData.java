package Driver;

import java.util.ArrayList;
import java.util.List;

import Entity.Account;
import Entity.Bank;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Hibernate_12_OneToMany_InsertData {
 public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Himanshu");
	System.out.println(emf);
	EntityManager manager = emf.createEntityManager();
	System.out.println(manager);
	EntityTransaction et = manager.getTransaction();
	System.out.println(et);
	
	Bank b1 = new Bank();
	b1.setbId(2);
	b1.setbName("AXIS");
	b1.setIfsc("AXIS77981");
	
	Account a1 = new Account();
	a1.setaId(201);
	a1.setBal(75000);
	a1.setuName("Banti");
	
	Account a2 = new Account();
	a2.setaId(202);
	a2.setBal(45000);
	a2.setuName("Salu");
	
	List<Account> acc = new ArrayList<Account>();
	acc.add(a1);
	acc.add(a2);
	
	b1.setAccout(acc);
	
	et.begin();
	manager.persist(b1);
	manager.persist(a1);
	manager.persist(a2);
	et.commit();
 }
}
