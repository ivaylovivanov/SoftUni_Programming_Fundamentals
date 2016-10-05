/**
 * Write a program to ask the user for 3 letters and print them in reversed 
 * order.
 */
package Exercises_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P10_Reverse_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char firstLetter = sc.next().charAt(0);
        char secondLetter = sc.next().charAt(0);
        char thirdLetter = sc.next().charAt(0);
        
        System.out.println(String.format("%s%s%s",thirdLetter, secondLetter, firstLetter));
    }
}
