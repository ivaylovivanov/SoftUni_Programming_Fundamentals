/**
 * Define a method Fib(n) that calculates the nth Fibonacci number. 
 */
package Exercises_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P0501_Fibonacci_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fib(n);
    }
    
    static void Fib(int n){
        int fib1 = 1;
        int fib2 = 1;
        int tempFib = 1;

        for (int i = 2; i <= n; i++) {
            tempFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = tempFib;
        }
        
        System.out.println(tempFib);
    }
}
