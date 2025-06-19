package Driver;

import Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Hibernate_03_UpdateData {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Himanshu");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

        // Step 1: Fetch the student to update
        int updateId = 104; // Change this to your student ID
        Student student = manager.find(Student.class, updateId);

        if (student != null) {
            // Step 2: Update fields
            student.setName("Nira");
            student.setAge(30);

            // Step 3: Commit transaction (JPA tracks changes automatically)
            System.out.println("✅ Updated student: " + student);
        } else {
            System.out.println("⚠️ Student with ID " + updateId + " not found.");
        }

        transaction.commit();

        manager.close();
        factory.close();
    }
}
