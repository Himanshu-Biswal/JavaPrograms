package Driver;
import Entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Hibernate_10_OnetoOne_Delete_UsingCaseCade {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Himanshu");
        System.out.println(factory);
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        Car car = manager.find(Car.class, 103);

        if (car != null) {
            transaction.begin();
            manager.remove(car);  // This will also remove the engine due to cascade
            transaction.commit();
            System.out.println("Car and Engine deleted successfully.");
        } else {
            System.out.println("Car not found.");
        }

        manager.close();
        factory.close();
    }
}
