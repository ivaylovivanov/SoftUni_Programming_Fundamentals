/**
 * Write a method that calculates all prime numbers in given range and returns 
 * them as list of integers.
 */
package Exercises_Methods_and_Debugging;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P0503_Primes_in_Given_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        IsPrime(start, end);
    }
    
    static void IsPrime(int start, int end){
        ArrayList<Boolean> composites = new ArrayList<>();
        for (int i = 0; i <= end; i++) {
            composites.add(true);
        }
        
        composites.set(0, Boolean.FALSE);
        composites.set(1, Boolean.FALSE);
        
        for (int i = 2; i <= (int)Math.round(Math.sqrt(end)); i++) {
            if (composites.get(i) == true) {
                int temp = 0;
                int j = i*(i + temp);
                while(j <= end){
                    composites.set(j, false);
                    temp++;
                    j = i*(i + temp);
                }
            }
        }
        ArrayList finalPrimes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (composites.get(i)) {
                finalPrimes.add(i);
            }
        }
        
        for (int i = 0; i < finalPrimes.size(); i++) {
            System.out.print(finalPrimes.get(i));
            if (i < finalPrimes.size()-1) {
                System.out.print(", ");
            }
        }
    }
}
