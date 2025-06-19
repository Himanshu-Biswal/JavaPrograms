package Driver;

import java.util.List;

import Entity.Account;
import Entity.Bank;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Hibernate_15_OneToMany_UpdateAllDetailsOfABank {
 public static void main(String[] args) {
	 EntityManagerFactory em = Persistence.createEntityManagerFactory("Himanshu");
     EntityManager manager = em.createEntityManager();
     EntityTransaction transaction = manager.getTransaction();

     Bank bank = manager.find(Bank.class, 1);  // Load Bank with ID 1
     if (bank != null) {
         transaction.begin();

         List<Account> accounts = bank.getAccout();  // Assuming getter is getAccout()
         for (Account acc : accounts) {
             acc.setuName(acc.getuName().toUpperCase());  // Example update: make usernames uppercase
             acc.setBal(acc.getBal() + 1000);              // Add 1000 to balance
             // No need to call merge() if entity is managed
         }

         transaction.commit();
     }


     manager.close();
     em.close();
}
}
