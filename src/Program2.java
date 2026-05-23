import java.util.Scanner;

/**
 * Program to print below pattern using java
 * @ @ @ @ @ @
 *
 *
 */
public class Program2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scan.nextInt();
        // loop for printing in column
        for(int i =1 ; i<=num ; i++) {
            System.out.print("@ ");
        }
    }

}
