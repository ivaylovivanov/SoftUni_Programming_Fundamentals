/**
 * Write a program that reads a number in hexadecimal format (0x##) convert it 
 * to decimal format and prints it.
 */
package Exercises_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P05_Variable_in_Hexadecimal_Format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next().substring(2);
        
        int num = Integer.parseInt(text, 16);
        System.out.println(num);          
    }
}
