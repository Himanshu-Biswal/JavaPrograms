package Project;
 import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class CartService {
 public static void main(String[] args) {
	Cart c = new Cart();
	Product p =new Product();
     p.setPname("phone");
     String p1=p.getPname();
     p.setPname("laptop");
     String p2=p.getPname();
     p.setPname("shoe");
     String p3=p.getPname();
     
     System.out.println("1. For View Cart");
     System.out.println("2. For Remove Cart");
     System.out.println("3. For Select View Cart");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    
     c.setQty(1);
     int c1=c.getQty();
     c.setQty(1);
     int c2=c.getQty();
     c.setQty(3);
     int c3=c.getQty();
//     String p1=p.getPname();
//     System.out.println(p1);
	Map<String,Integer> m = new LinkedHashMap<String, Integer>();
	m.put(p1,1);
	m.put(p2,2);
	m.put(p3,3);
	if(n==1) {
		System.out.println("View The Cart");
		System.out.println(m);
	}
	if(n==2) {
		System.out.println("Remove Item");
		m.remove(p1);
		System.out.println(m);
	}
	else System.out.println("enter valid ");
}
}
