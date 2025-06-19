package Driver;


import Entity.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
public class Hibernate_08_OneToOne_Update {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Himanshu");
        System.out.println(factory);
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

      Car car = manager.find(Car.class, 101);

        if (car != null) {
            transaction.begin(); 

            // Update car fields
            car.setName("Bugati");
            car.setPrice(789000000);

            // Update associated engine
            Engine engine = car.getEnginee();
            if (engine != null) {
                engine.setType("Hybrid");
                engine.setCc(5000);
            }

            transaction.commit(); 
            System.out.println("Car and Engine updated successfully.");
        } else {
            System.out.println("Data not found");
        }

        manager.close();
        factory.close();
    }
}
