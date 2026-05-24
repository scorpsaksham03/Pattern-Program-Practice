import java.util.Scanner;

/**
 * Program to print below pattern using java
 * _ *
 * _ _ * *
 * _ _ _ * * *
 * _ _ _ _ * * * *
 * _ _ _ _ _ * * * * *
 */
public class Program12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        // loop for row
        for (int i = 1; i <= row; i++) {
            // loop for printing right-angled triangle using "-"
            for (int j = 1; j <= i ; j++) {
                // print the value of i
                System.out.print("_");
            }

            // loop to print right-angled triangle using *
            for (int k = 1; k <= i ; k++) {
                // print the value of i
                System.out.print("*");
            }
            // sending the cursor to next line
            System.out.println();
        }
    }

}
