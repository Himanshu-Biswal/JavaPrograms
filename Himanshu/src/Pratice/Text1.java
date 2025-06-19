package Pratice;

import java.util.Scanner;

public class Text1 {
    // Function to find GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM of two numbers
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
//        System.out.print("Enter the first number: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Enter the second number: ");
//        int num2 = scanner.nextInt();
        
        // Calculating LCM
//        int lcm = lcm(num1, num2);
//        
//        // Displaying the result
//        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        System.out.println(gcd(5,15));
        scanner.close();
    }
}

