package STRING;

public class S_35_Print2ndMaxOccuredCharcterUsingReplace {
	public static void main(String[] args) {
        String str = "himanshu bhusan biswal";
         char maxChar=' ',maxChar1=' ';
         int max=0,max1=0;
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Skip already counted characters
            if (str.indexOf(ch) != i) {
                continue;
            }
            
            // Count occurrences using the replace() function
            String str1=str.replace(String.valueOf(ch), "");
            int count = str.length() - str1.length();
            if(count>max) {

            	max=count;
            	maxChar=ch;
            }
            
           if(count>max1 && count<max ) {
            	max1=count;
            	maxChar1=ch;
            }
            
        }
        System.out.println(maxChar + " occurs " + max + " times.");
        System.out.println(maxChar1 + " occurs " + max1 + " times.");
        
    }
}
