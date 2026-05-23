import java.util.Scanner;

/**
 * Program to print below pattern using java
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 *
 * no of rows = 4
 * no of columns = 5
 */

public class Program5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        int col = scan.nextInt();
        // loop for row
        for (int j = 1; j <= row; j++) {
            // loop for printing in column
            for (int i = 1; i <= col; i++) {
                // print the value of i
                System.out.print(i);
            }
            // sending the cursor to next line
            System.out.println();
        }
    }
}
