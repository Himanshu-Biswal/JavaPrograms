package JAVA_8;

import java.util.function.Function;

public class Java_08_06_IntegerToChar {
 public static void main(String[] args) {
	int a[]= {49,50,51,52,53,54,55,56,97};
	Function<Integer, Character> f = i->(char)(i.intValue());

	for(int i=0;i<a.length;i++) {
			System.out.println(f.apply(a[i]));
	}
}
}

