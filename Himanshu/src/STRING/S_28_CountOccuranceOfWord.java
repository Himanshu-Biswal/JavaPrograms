package STRING;

// input="Banglore is Banglore city";
// output=Banglore:2,is=1,city=1; 

public class S_28_CountOccuranceOfWord {
	
	    public static void main(String[] args) {
	        // Input string
	        String input = "Banglore is a Banglore city";
	        String[] words = input.split(" ");
	        
	        for (int i = 0; i < words.length; i++) {
	            int count = 1;
	            
	            // Check if the word has already been counted
	            if (words[i] != null) {
	                for (int j = i + 1; j < words.length; j++) {
	                    if (words[i].equals(words[j])) {
	                        count++;
	                        words[j] = null; 
	                    }
	                }
	                System.out.print(words[i] + "=" + count + "\n");
	            }
	        }
  }
}
