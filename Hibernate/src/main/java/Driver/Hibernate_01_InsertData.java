package Driver;

import Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Hibernate_01_InsertData {
 public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Himanshu");
	System.out.println(factory);
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	
	Student s1 = new Student();
	s1.setId(105);
	s1.setAge(25);
	s1.setName("Madhu");
	
	Student s2 = new Student();
	s2.setId(106);
	s2.setAge(26);
	s2.setName("Jay");
	
	transaction.begin();
   
	manager.persist(s1);
	manager.persist(s2);
	transaction.commit();
	
}
}
