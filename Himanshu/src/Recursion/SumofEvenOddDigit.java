package Recursion;

public class SumofEvenOddDigit {
	
			static void m1(int n, int evenSum, int oddSum) {
		        if (n == 0) {
		            // When n becomes 0, print both even and odd sums
		            System.out.println("Sum of even digits: " + evenSum);
		            System.out.println("Sum of odd digits: " + oddSum);
		            return;
		        }

		        // Get the last digit
		        int digit = n % 10;

		        // Check if the digit is even or odd and add it to the respective sum
		        if (digit % 2 == 0) {
		            evenSum += digit;
		        } else {
		            oddSum += digit;
		        }

		        // Recursively call the function with the remaining digits (n / 10)
		        m1(n / 10, evenSum, oddSum);
		    }
			
		
	 public static void main(String[] args) {
		int n=123456789;
		  
	       m1(n,0,0);
	}
	}





