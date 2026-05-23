import java.util.Scanner;

/**
 * Program to print below pattern using java
 * 1 1 1 1 1
 * 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4 4
 *
 * no of rows = 4
 * no of columns = 5
 */

public class Program4 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        int col = scan.nextInt();
        // loop for row
        for(int j=1;j<=row;j++) {
            // loop for printing in column
            for (int i = 1; i <= col; i++) {
                // print the value of j
                System.out.print(j);
            }
            // sending the cursor to next line
            System.out.println();
        }
    }
}
