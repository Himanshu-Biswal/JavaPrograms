package JAVA_8;

import java.util.function.Predicate;

public class Java_08_02_PreDefinedFunctionalInterface_01_Predicate {
	public static void main(String[] args) {
		int n = 8;
		Predicate<Integer> p = i -> i % 2 == 0;  //DataType
		System.out.println(p.test(n));
	}
}
