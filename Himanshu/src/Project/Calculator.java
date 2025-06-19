package Project;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a & b Value :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter '+' for Addition");
		System.out.println("Enter '-' for Substraction");
		System.out.println("Enter '*' for Multipication");
		System.out.println("Enter '/' for Divide");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case '+' -> System.out.println(a + " + " + b + " = " + (a + b));
		case '-' -> System.out.println(a + " - " + b + " = " + (a - b));
		case '*' -> System.out.println(a + " * " + b + " = " + (a * b));
		case '/' -> System.out.println(a + " - " + b + " = " + (a / b));
		default  -> System.out.println("Invalid Input Enter Valid Input");
		}
	}
}
