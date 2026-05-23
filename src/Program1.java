import java.util.Scanner;

/**
 * Program to print below pattern using java
 * @
 * @
 * @
 * @
 */
public class Program1 {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number ");
       int num = scan.nextInt();
        // loop for printing in row
       for(int i =1 ; i<=num ; i++) {
           System.out.println("@");
       }
    }

}
