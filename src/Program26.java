import java.util.Scanner;

/**
 * Program to print below pattern using java
 *
 *
 *
 *        *
 *      * _ *
 *    * _ _ _ *
 *  * _ _ _ _ _ *
 *    * _ _ _ *
 *      * _ *
 *        *
 *
 */

public class Program26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if ( k == (2 * i - 1) || k == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // sending the cursor to next line
            System.out.println();
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * (row - i + 1) - 1); k++) {
                if (k == (2 * (row - i + 1) - 1) || k == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // sending the cursor to next line
            System.out.println();

        }
    }

}


