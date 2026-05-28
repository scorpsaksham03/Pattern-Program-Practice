import java.util.Scanner;

/**
 * Program to print below pattern using java

 * * * * * *
 * * _ _ _ *
 * * _ _ _ *
 * * _ _ _ *
 * * * * * *
 */

public class Program21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scan.nextInt();
        for (int i = 1; i <= row; i++) {
           for(int j= 1; j<=row; j++){
                if(i==1 || i==row || j==1 || j==row){
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
