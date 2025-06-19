package Driver;

import Entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Hibernate_07_OneToOne_FetchData {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Himanshu");
		System.out.println(factory);
		EntityManager manager = factory.createEntityManager();
		
		Car car = manager.find(Car.class, 101);
		
		if(car!=null) {
			System.out.println("Car Details !!!!");
			System.out.println(car.getId()+":"+car.getName()+":"+car.getPrice());
			
			Engine engine = car.getEnginee();
			if(engine!=null) {
				System.out.println("Engine Details");
				System.out.println(engine.getEid()+":"+engine.getType()+":"+engine.getCc());
			}
		}
	}
}
