package Driver;

import java.util.List;
import Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Hibernate_02_FetchData {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Himanshu");
        System.out.println(factory);

        EntityManager manager = factory.createEntityManager();

        // --- Fetch single student by ID
        Student fetched = manager.find(Student.class, 103);
        System.out.println("Fetched by ID: " + fetched);

        // --- Fetch all students
        // Query is an interface in jakarta.persistence
        // JPQL syntax SELECT s FROM Student s
//        Query query = manager.createQuery("SELECT s FROM Student s");
        // This is Sql Query
//        Query query = manager.createNativeQuery("SELECT * FROM student", Student.class);
        // In HQL query it start from From student          
        Query query = manager.createQuery("FROM Student");
		List<Student> list = query.getResultList();

        System.out.println("\nAll Students in Database:");
        for (Student s : list) {
            System.out.println(s);
        }

        manager.close();
        factory.close();
    }
}
