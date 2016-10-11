/**
 * You are given a program that checks if numbers in a given range [2...N] are 
 * prime. For each number is printed "{number} is prime -> {True or False}". The 
 * code however, is not very well written. Your job is to modify it in a way 
 * that is easy to read and understand.
 */
package Exercises_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author Ivailo
 */
public class P16_Fast_Prime_Checker_Refactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++)
        {
            String flag = "True";
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    flag = "False";
                    break;
                }
            }
            
            System.out.println(String.format("%s -> %s", i, flag));
        } 
    }
}
