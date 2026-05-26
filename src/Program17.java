import java.util.Scanner;

/**
 * Program to print below pattern using java


 *  * * * * *
 *  _ * * * *
 *  _ _ * * *
 *  _ _ _ * *
 *  _ _ _ _ *
 *
 */
public class Program17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        // loop to print first pattern
        for (int i = 1; i <= row; i++) {
            // loop for printing right-angled triangle
            for (int j = 2; j <= i; j++) {
                // print the value of i
                System.out.print("_");
            }

            // loop to print inverted right-angled triangle using *
            for (int k = 1; k <= row - i +1; k++) {
                // print the value of i
                System.out.print("*");
            }
            // sending the cursor to next line
            System.out.println();
        }
    }
}
