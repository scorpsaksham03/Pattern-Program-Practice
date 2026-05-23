import java.util.Scanner;

/**
 * Program to print below pattern using java
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 *
 * no of rows = 5
 * no of columns = 5
 */
public class Program6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        // loop for row
        for (int j = 1; j <= row; j++) {
            // loop for printing in column
            for (int i = 1; i <= j; i++) {
                // print the value of i
                System.out.print("*");
            }
            // sending the cursor to next line
            System.out.println();
        }
    }
}
