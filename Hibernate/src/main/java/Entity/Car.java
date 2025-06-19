package Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Car {
	@Id
	private int id;
	private String name;
	private double price;
	
//	In cascade Type used when we want to save or manipulate data for 
//	parent table and it manipulated automatically in child table .
	@OneToOne(cascade = CascadeType.ALL)  
//	@OneToOne
	private Engine enginee;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Engine getEnginee() {
		return enginee;
	}
	public void setEnginee(Engine enginee) {
		this.enginee = enginee;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + ", enginee=" + enginee + "]";
	}
	

}
