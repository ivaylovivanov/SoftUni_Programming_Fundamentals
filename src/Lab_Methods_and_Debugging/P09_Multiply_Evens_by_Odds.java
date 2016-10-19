/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author Ivailo
 */
public class P09_Multiply_Evens_by_Odds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(GetMultipleOfEvensAndOdds(n));
    }
    
    static int GetMultipleOfEvensAndOdds(int n){
        int sumEvens = GetSumOfEvenDigits(n);
        int sumOdds =  GetSumOfOddDigits(n);
        return sumEvens * sumOdds;
    }
    
    static int GetSumOfEvenDigits(int n){
        int sum = 0;
        
        while(n > 0){
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0) {
                sum += n%10;
            }
            n /= 10;
        }
        //System.out.println("Even: " + sum);
        return sum;
    }
    
    static int GetSumOfOddDigits(int n){
        int sum = 0;
        
        while(n > 0){
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0) {
                sum += n%10;
            }
            n /= 10;
        }
        //System.out.println("Odd: " + sum);
        return sum;
    }
}
