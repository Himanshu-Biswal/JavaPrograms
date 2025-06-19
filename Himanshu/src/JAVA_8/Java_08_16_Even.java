package JAVA_8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Java_08_16_Even {
 public static void main(String[] args) {
	int a[]= {11,12,13,14,15,16,17,18,19};
	Predicate<Integer> p=i->i%2==0;
	for(int i=0;i<a.length;i++) {
		if(p.test(a[i]))
			System.out.println(a[i]);
	}
	System.out.println("================");
	Function<Integer, Integer> f=n->n*n;
	for(int i=0;i<a.length;i++) {
		System.out.println(f.apply(a[i]));
	}
	System.out.println("=================");

	Function<Integer, Boolean> f1=n->{
		int sum=0,m=n;
		while(n!=0) {
			sum=sum*10+(n%10);
			n/=10;
		}
		return sum==m;
	};
	System.out.println(f1.apply(323));
}
}
