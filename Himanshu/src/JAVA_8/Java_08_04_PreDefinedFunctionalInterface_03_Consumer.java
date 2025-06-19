package JAVA_8;

import java.util.function.Consumer;

public class Java_08_04_PreDefinedFunctionalInterface_03_Consumer {
 public static void main(String[] args) {
	Consumer<String> c = i->System.out.println("Name:-"+i);//DataType
	c.accept("Madhusmita");
}
}
