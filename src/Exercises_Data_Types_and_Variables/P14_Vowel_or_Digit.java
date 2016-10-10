/**
 * Create a program to check if given symbol is digit, vowel or any other symbol.
 */
package Exercises_Data_Types_and_Variables;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P14_Vowel_or_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char myChar = sc.next().charAt(0);
        
        List vowels = Arrays.asList(new Character[] { 'a', 'e', 'i', 'o', 'u', 'y' });
        List digits = Arrays.asList(new Character[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' });
        if (vowels.indexOf(myChar) != -1) {
            System.out.println("vowel");
        } else if (digits.indexOf(myChar) != -1) {
            System.out.println("digit");
        } else {
            System.out.println("other");
        }
    }
}
