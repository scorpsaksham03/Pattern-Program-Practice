import java.util.Scanner;

/**
 * Program to print below pattern using java
 * 1 1 1 1 1
 * 2 2 2 2 1 2
 * 3 3 3 3 1 2 3
 * 4 4 4 4 1 2 3 4
 */
public class Program13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        // loop for row
        for (int i = 1; i <= row; i++) {
            // loop for printing square
            for (int j = 1; j <= row ; j++) {
                // print the value of i
                System.out.print(i);
            }

            // loop to print right-angled triangle using *
            for (int k = 1; k <= i ; k++) {
                // print the value of i
                System.out.print(k);
            }
            // sending the cursor to next line
            System.out.println();
        }
    }

}
