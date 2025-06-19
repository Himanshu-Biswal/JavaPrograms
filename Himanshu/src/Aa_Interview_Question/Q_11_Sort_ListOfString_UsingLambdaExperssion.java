package Aa_Interview_Question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q_11_Sort_ListOfString_UsingLambdaExperssion {
 public static void main(String[] args) {
	 List<String> list = Arrays.asList("Banana", "Apple", "Mango");

//	 Collections.sort(list, (s1, s2) -> s1.compareTo(s2));

	 // or using List.sort:
	 list.sort((s1, s2) -> s1.compareTo(s2));
  System.out.println(list);
}
} 
