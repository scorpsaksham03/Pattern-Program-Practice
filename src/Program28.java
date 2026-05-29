import java.util.Scanner;

/**
 * Program to print below pattern using java
 *
 *
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 *
 */
public class Program28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        int num =1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            // sending the cursor to next line
            System.out.println();
        }
    }
}
