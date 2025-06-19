package Driver;

import Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Hibernate_04_DeleteData {
    public static void main(String[] args) {
        // Create EntityManagerFactory
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Himanshu");

        // Create EntityManager
        EntityManager manager = factory.createEntityManager();

        // Start transaction
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        // Try to fetch the student by ID
        int deleteId = 106; // change this to the ID you want to delete
        Student toDelete = manager.find(Student.class, deleteId);

        if (toDelete != null) {
            manager.remove(toDelete);
            System.out.println("✅ Deleted student: " + toDelete);
        } else {
            System.out.println("⚠️ Student with ID " + deleteId + " not found.");
        }

        // Commit transaction
        transaction.commit();

        // Cleanup
        manager.close();
        factory.close();
    }
}
