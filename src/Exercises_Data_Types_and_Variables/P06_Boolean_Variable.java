/**
 * Write a program that reads a string, converts it to Boolean variable and 
 * prints “Yes” if the variable is true and “No” if the variable is false.
 */
package Exercises_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P06_Boolean_Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        
        Boolean flag = Boolean.parseBoolean(text);
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }                
    }
}
