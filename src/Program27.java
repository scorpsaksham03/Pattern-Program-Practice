import java.util.Scanner;

/**
 * Program to print below pattern using java
 *
 *
 *
 _1__2__3__4
 _5__6__7__8
 _9_10_11_12
 13_14_15_16
 *
 */

public class Program27 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        int num =1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row ; j++) {
                if(num<10) {
                    System.out.print("  ");
                }else{
                    System.out.print(" ");
                }
                System.out.print(num+" ");
                num++;
            }
            // sending the cursor to next line
            System.out.println();
        }
    }
}
