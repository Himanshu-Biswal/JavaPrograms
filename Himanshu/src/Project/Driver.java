package Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Driver {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<Product> l1 = new ArrayList<Product>();
	
	boolean flag = true;
	do {
		System.out.println("Enter the Operation");
		System.out.println("1.Add Product");

		System.out.println("2.View Cart");
		System.out.println("3.Remove product from cart");
		System.out.println("4.Find Product");
		System.out.println("5.Exit");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:{
			Driver.addProduct(l1);
			
		}break;
		case 2:{
			Driver.viewCart(l1);
			
		}break;
		case 3:{
			Driver.removeProduct(l1);
		}break;
		case 4:{
			Driver.findProduct(l1);
		}break;
		case 5:{
			System.out.println("Thank You...!");
			flag=false;
		}break;
		default:{
			System.out.println("Enter valid:");
		}break;
				
		
		}
	}while(flag);
	
}
public static void addProduct(List<Product> l1) {
	Product p1=new Product();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Product Name: ");
	String pname=sc.next();
	p1.setPname(pname);
	System.out.println("Enter the Product id: ");
	int pid=sc.nextInt();
	p1.setPid(pid);
	System.out.println("Enter the Product price: ");
	int pPrice=sc.nextInt();
	p1.setPrice(pPrice);
	l1.add(p1);
}
public static void viewCart(List<Product> l1) {
	Iterator i = l1.iterator();
	while(i.hasNext()) {
		Product p1=(Product) i.next();
		System.out.println(p1);
	}
}
public static void removeProduct(List<Product> l1) {
	System.out.println("Enter the id to remove");
	int id = new Scanner(System.in).nextInt();
	Iterator i = l1.iterator();
	while(i.hasNext()) {
	Product s =(Product) i.next();
	if(id==s.getPid()) {
		i.remove();
	}
	}
}
public static void findProduct(List<Product> l1) {
	System.out.println("Enter the id to find");
	int id = new Scanner(System.in).nextInt();
	Iterator i = l1.iterator();
	while(i.hasNext()) {
	Product s =(Product) i.next();
	if(id==s.getPid()) {
		System.out.println(s);
	}else {
		System.out.println("Product Not found");
	}
	}
}
}