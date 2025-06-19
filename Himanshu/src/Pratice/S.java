package Pratice;

public class S {
	

	
	    public static void main(String[] args) {
	        for (int i = 1; i <= 100; i++) {
	            int count = 0;

	            // Count primes up to the current number
	            for (int j = 2; j <= i/2; j++) {
	                if (isPrime(j)) {
	                    count++;
	                }
	            }

	            // Check if the count of primes is odd (alternate prime position)
	            if (count % 2 != 0) {
	                System.out.println(i);
	            }
	        }
	    }

	    static boolean isPrime(int n) {
	        if (n < 2) return false;

	        for (int i = 2; i <=n*n; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}



