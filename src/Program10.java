import java.util.Scanner;

/**
 * Program to print below pattern using java
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 * no of rows = 5
 * no of columns = 5
 */
public class Program10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        // loop for row
        for (int i = 1; i <= row; i++) {
            // loop for printing in column
            for (int j = 1; j <= i ; j++) {
                // print the value of i
                System.out.print(i);
            }
            // sending the cursor to next line
            System.out.println();
        }
    }
}
