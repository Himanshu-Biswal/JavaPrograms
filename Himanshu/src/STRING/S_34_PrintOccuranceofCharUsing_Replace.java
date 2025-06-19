package STRING;

public class S_34_PrintOccuranceofCharUsing_Replace {
	public static void main(String[] args) {
        String s = "himanshu bhusan biswal";
       
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Skip already counted characters
            if (s.indexOf(ch) != i) {
                continue;
            }
            
            // Count occurrences using the replace() function
            String str1=s.replace(ch+"", "");
            int count = s.length() - str1.length();
            
            // Print the character and its occurrence
            System.out.println(ch + " occurs " + count + " times.");
        }
    }
}
