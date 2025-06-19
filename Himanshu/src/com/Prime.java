

package com;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean flag;

        System.out.println("Prime digits in the number are:");

        while (n != 0) {
            int r = n % 10; 
            flag = true;
            
            if (r < 2) {
                flag = false; 
            } else {
                for (int i = 2; i <= r / 2; i++) {
                    if (r % i == 0) {
                        flag = false; 
                        break;
                    }
                }
            }

            if (flag) {
                System.out.print(r + " ");
            }

            n = n / 10; 
        }
        sc.close();
    }
}
