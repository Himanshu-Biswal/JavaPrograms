package Aa_Interview_Question;

public class Q_10_Pattern {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1) {
                    // First row: A B C D E
                    System.out.print((ch++) + " ");
                } else if (i >= 2 && i < n) {
                    if (j == 1) {
                        System.out.print((ch++) + " ");
                    } else if (j >= 2 && j <= 4) {
                        System.out.print((num++) + " ");
                    } else if (j == 5) {
                        System.out.print((ch++) + " ");
                    }
                } else if (i == n) {
                    // Last row: I M N O P
                    System.out.print((ch++) + " ");
                }
            }
            System.out.println();
        }
    }
}
 