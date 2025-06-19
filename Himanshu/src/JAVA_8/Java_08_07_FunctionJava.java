package JAVA_8;

import java.util.function.Function;

public class Java_08_07_FunctionJava {
 public static void main(String[] args) {
	 Function<Character,Integer> fn = c->(int)c;
	 System.out.println(fn.apply('a'));
}
}
