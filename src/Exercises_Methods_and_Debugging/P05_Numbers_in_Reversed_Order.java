/**
 * Write a method that prints the digits of a given decimal number in a reversed 
 * order.
 */
package Exercises_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P05_Numbers_in_Reversed_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        System.out.println(PrintReverse(number));
    }
    
    static String PrintReverse(String n){
        
        String reverse = String.valueOf(n);
        String finalString = "";
        
        for (int i = reverse.length() - 1; i >= 0; i--) {
            finalString = finalString.concat(String.valueOf(reverse.charAt(i)));
        }
        
        return finalString;
    }
}
