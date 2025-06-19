package STRING;

public class S_24_CharcterToNum {
 public static void main(String[] args) {

	 String input = "aabccadd";
     String output = "";  // To store the compressed string
     int count = 1;  // Count the occurrences of each character

     // Loop through the string
     for (int i = 0; i < input.length(); i++) {
         // If we're not at the last character and the current character matches the next one
         if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
             count++;  // Increase the count
         }
         else {
             // Otherwise, add the count and the current character to the output string
             output = output + count + input.charAt(i);
             count = 1;  // Reset the count for the next character
         }
     }

     // Print the compressed output string
     System.out.println("Compressed String: " + output);
}
}
