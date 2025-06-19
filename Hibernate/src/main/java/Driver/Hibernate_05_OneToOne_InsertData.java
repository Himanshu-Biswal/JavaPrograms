package Driver;


import Entity.Car;
import Entity.Engine;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Hibernate_05_OneToOne_InsertData {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Himanshu");
		System.out.println(factory);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Engine e1 = new Engine();
		e1.setEid(1);
		e1.setType("Petrol");
		e1.setCc(2200);
		
	   Car c1 = new Car();
		c1.setId(101);
		c1.setName("Audi");
		c1.setPrice(7200000);
		c1.setEnginee(e1);
		
		transaction.begin();
		manager.persist(c1);
		manager.persist(e1);
		transaction.commit();

	}

}
