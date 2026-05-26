import java.util.Scanner;

/**
 * Program to print below pattern using java


 *  * * * * * * * * *
 *  _ * * * * * * *
 *  _ _ * * * * *
 *  _ _ _ * * *
 *  _ _ _ _ *
 *
 */

public class Program20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        // loop to print first pattern
        for (int i = 1; i <= row; i++) {
            // loop for printing right-angled triangle
            for (int j = 1; j <= i; j++) {
                // print the value of i
                System.out.print("_");
            }

            for (int k = 1; k <= (2*(row - i +1)-1); k++) {
                // print the value of i
                System.out.print("*");
            }
            // sending the cursor to next line
            System.out.println();
        }
    }

}
