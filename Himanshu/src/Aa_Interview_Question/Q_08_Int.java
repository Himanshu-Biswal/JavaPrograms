package Aa_Interview_Question;

import java.util.Scanner;


// input
//2
//0 2 10
//5 3 5
public class Q_08_Int {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int t = sc.nextInt(); // number of test cases

     for (int i = 0; i < t; i++) {
         int a = sc.nextInt();
         int b = sc.nextInt();
         int n = sc.nextInt();

         int sum = a;
         for (int j = 0; j < n; j++) {
             sum += (int)(Math.pow(2, j) * b);
             System.out.print(sum + " ");
         }
         System.out.println();
     }

     sc.close();
}
}
