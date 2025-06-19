package Pattern;

public class PyramidNumber {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces to align the pyramid
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  "); // Two spaces
            }

            // Print the increasing sequence
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print the decreasing sequence
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line
            
            System.out.println();
        }
    }
}