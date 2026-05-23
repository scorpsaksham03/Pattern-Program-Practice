import java.util.Scanner;
/**
 * Program to print below pattern using java
 * @@@@@@
 * @@@@@@
 *
 * no of rows = 2
 * no of columns = 6
 */
public class Program3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        int col = scan.nextInt();
        // loop for row
        for(int j=1;j<=row;j++) {
            // loop for printing in column
            for (int i = 1; i <= col; i++) {
                System.out.print("@ ");
            }
            // sending the cursor to next line
            System.out.println();
        }
    }
}
