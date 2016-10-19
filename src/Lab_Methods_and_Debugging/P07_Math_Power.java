/**
 * Create a method that calculates and returns the value of a number raised to 
 * a given power.
 */
package Lab_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P07_Math_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        long power = sc.nextInt();
        System.out.println(RaisePower(number, power));
    }
    
    static long RaisePower(long n, long p){
        long result = 1;
        
        for (long i = 0; i < p; i++) {
            result *= n;
        }
        
        return result;
    }
    
}
