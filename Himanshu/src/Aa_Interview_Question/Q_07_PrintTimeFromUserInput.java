
package Aa_Interview_Question;

import java.util.Scanner;

public class Q_07_PrintTimeFromUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour (0-23):");
        int hour = sc.nextInt();
        System.out.println("Enter minutes (0-59):");
        int min = sc.nextInt();

        if (hour >= 0 && hour < 24 && min >= 0 && min < 60) {
            String period = (hour < 12) ? "AM" : "PM";
            int displayHour = hour % 12;
            if (displayHour == 0) displayHour = 12;
               
            System.out.println("Time is: "+displayHour+":"+min+" "+period);
        } else {
            System.out.println("Invalid input. Please enter hour (0-23) and minutes (0-59).");
        }
        sc.close();
    }
}
