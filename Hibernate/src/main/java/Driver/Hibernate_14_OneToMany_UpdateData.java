package Driver;

import java.util.List;
import Entity.Account;
import Entity.Bank;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Hibernate_14_OneToMany_UpdateData {
    public static void main(String[] args) {
        EntityManagerFactory em = Persistence.createEntityManagerFactory("Himanshu");
        EntityManager manager = em.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        Bank bank = manager.find(Bank.class, 1);
        if (bank != null) {
            transaction.begin();

            List<Account> accounts = bank.getAccout();
            for (Account acc : accounts) {
                if ("Mad".equals(acc.getuName())) {  // Correct way to compare strings
                    acc.setuName("Madhu");
                    manager.merge(acc); // merge to update, not persist
                }
            }

            transaction.commit();
        }

        manager.close();
        em.close();
    }
}
