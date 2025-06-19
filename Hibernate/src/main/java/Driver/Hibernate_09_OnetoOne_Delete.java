package Driver;

import Entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Hibernate_09_OnetoOne_Delete {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Himanshu");
        System.out.println(factory);
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        Car car = manager.find(Car.class, 103);

        if (car != null) {
            transaction.begin();
            manager.remove(car);  // remove the Car 
            transaction.commit();
            System.out.println("Car deleted successfully. But Engine Not Deleted");
        } else {
            System.out.println("Car not found.");
        }

        manager.close();
        factory.close();
    }
}
