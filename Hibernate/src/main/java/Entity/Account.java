package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
 @Id
 private int aId;
 private String uName;
 private double bal;
public int getaId() {
	return aId;
}
public void setaId(int aId) {
	this.aId = aId;
}
public String getuName() {
	return uName;
}
public void setuName(String uName) {
	this.uName = uName;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
@Override
public String toString() {
	return "Account [aId=" + aId + ", uName=" + uName + ", bal=" + bal + "]";
}
public Account() {
	super();
}
 
 
}
