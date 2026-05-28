import java.util.Scanner;

/**
 * Program to print below pattern using java
 * *
 * * *
 * * _ *
 * * _ _ *
 * * * * * *
 *
 */

public class Program22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        for (int i = 1; i <= row; i++) {
            for(int j= 1; j<=i; j++){
                if( i==row || j==1 || j == i){
                    System.out.print("*");
                }
                else{
                    System.out.print("_");
                }
            }
            // sending the cursor to next line
            System.out.println();
        }
    }
}
