/**
 * Write a method that returns the English name of the last digit of a given 
 * number. Write a program that reads an integer and prints the returned value 
 * from this method.
 */
package Exercises_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P04_Name_of_The_Last_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        System.out.println(GetNameOfDigit(number));
    }
    
    static String GetNameOfDigit(int a){
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        int last = a % 10;
        
        return numbers[last];
    }
}
