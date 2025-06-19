package JAVA_8;

import java.util.function.Function;

public class Java_08_03_PreDefinedFunctionalInterface_02_Function {
 public static void main(String[] args) {
	Function<Integer,Integer> f=i->i*i; //DataType,ReturnType
	System.out.println(f.apply(5));
}
}
