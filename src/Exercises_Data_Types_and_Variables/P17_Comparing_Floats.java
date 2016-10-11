/**
 * Write a program that safely compares floating-point numbers (double) with 
 * precision eps = 0.000001. Note that we cannot directly compare two 
 * floating-point numbers a and b by a==b because of the nature of the 
 * floating-point arithmetic. Therefore, we assume two numbers are equal if they
 * are more closely to each other than some fixed constant eps. 
 */
package Exercises_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P17_Comparing_Floats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numberA = sc.nextDouble();
        double numberB = sc.nextDouble();
        double eps = 0.000001;
        
        if (Math.abs(numberA - numberB) < eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
