/**
 * Write a Boolean method IsPrime(n) that check whether a given integer number 
 * n is prime. 
 */
package Exercises_Methods_and_Debugging;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P0502_Prime_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (IsPrime(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    
    static Boolean IsPrime(Long n){
        Boolean isPrime = true;
        ArrayList<Boolean> composites = new ArrayList<>();
        
        if (n > 1) {
            for (long i = 2; i <= (long)Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
        
        return isPrime;
    }
}