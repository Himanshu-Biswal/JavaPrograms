package Driver;
import Entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Hibernate_11_Delete_Engine_First {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Himanshu");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        // Step 1: Find Car
      Car car = manager.find(Car.class, 101);

        if (car != null && car.getEnginee() != null) {
            transaction.begin();

           Engine engine = car.getEnginee();

            // Step 2: Detach the engine from car (to prevent FK constraint failure)
            car.setEnginee(null);
            manager.merge(car); // Update car to remove the relation

            // Step 3: Delete the engine
            manager.remove(engine);

            transaction.commit();
            System.out.println("Engine deleted successfully.");
        } else {
            System.out.println("Car or Engine not found.");
        }

        manager.close();
        factory.close();
    }
}
