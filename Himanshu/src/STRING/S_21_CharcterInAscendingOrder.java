package STRING;

public class S_21_CharcterInAscendingOrder {
  public static void main(String[] args) {

	  String s = "ddddcccbbba";
      char ch[] = s.toCharArray();
      
      // Sort the characters in ascending order using bubble sort
      for (int i = 0; i < ch.length ; i++) {
          for (int j = i + 1; j < ch.length; j++) {
        	  
              if (ch[i] > ch[j]) {
                  // Swap characters if they are in the wrong order
                  char temp = ch[i];
                  ch[i] = ch[j];
                  ch[j] = temp;
              }
          }
      }
      
      // Convert the sorted characters back to a string and print it
//      String str = new String(ch);
      System.out.println(ch);  // Output the sorted string
}
}
