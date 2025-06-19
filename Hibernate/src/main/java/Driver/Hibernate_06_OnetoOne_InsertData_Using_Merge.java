package Driver;

import Entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Hibernate_06_OnetoOne_InsertData_Using_Merge {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Himanshu");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        Engine engine = new Engine();
        engine.setEid(3);
        engine.setType("Petrol");
        engine.setCc(3000);

        Car car = new Car();
        car.setId(103); // ID must match existing record
        car.setName("Ferarri");
        car.setPrice(89000000);
        car.setEnginee(engine); // updated engine

        transaction.begin();
        manager.merge(car); // merge will update if the record with ID exists
        transaction.commit();

        System.out.println("Car and Engine updated successfully with merge.");
        manager.close();
        factory.close();
    }
}
