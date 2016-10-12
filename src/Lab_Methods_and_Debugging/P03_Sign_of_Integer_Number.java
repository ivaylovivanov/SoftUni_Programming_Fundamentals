/**
 * Create a method that prints the sign of an integer number n.
 */
package Lab_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author Ivailo
 */
public class P03_Sign_of_Integer_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintSign(n);
    }
    
    static void PrintSign(int n){
        if (n > 0) {
            System.out.printf("The number %s is positive.", n);
        } else if (n < 0) {
            System.out.printf("The number %s is negative.", n);
        } else {
            System.out.printf("The number %s is zero.", n);
        }
                
    }
}
