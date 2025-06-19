package Aa_Interview_Question;

public class Q_03_VowelCount_UsingStream {
 public static void main(String[] args) {
	 String s = "Hello Stream API in Java!";

     long vowelCount = s
             .chars() 
             .mapToObj(c -> (char) c) 
             .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1) 
             .count(); 

     System.out.println("Number of vowels: " + vowelCount);
}
}
