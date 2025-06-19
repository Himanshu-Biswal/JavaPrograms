package Serialization;

public class Address implements Cloneable {
 String country;
 String city;
public Address(String country, String city) {
	super();
	this.country = country;
	this.city = city;
}
@Override
public String toString() {
	return "Address [country=" + country + ", city=" + city + "]";
}
@Override
public Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
}
