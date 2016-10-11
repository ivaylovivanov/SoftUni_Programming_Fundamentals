/**
 * Create a program to convert a decimal number to hexadecimal and binary number 
 * and print it.
 */
package Exercises_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P15_Integer_to_Hex_and_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();        
        String HEX = Integer.toHexString(Integer.parseInt(number)).toUpperCase();
        
        System.out.println(HEX); 
        System.out.println(Integer.toBinaryString(Integer.parseInt(number))); 
    }
}
