/**
 * Write a method that receives a name as parameter and prints on the console. 
 * “Hello, <name>!”
 */
package Exercises_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P02_Hello_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        PrintName(name);
    }
    
    static void PrintName(String name){
        System.out.println(String.format("Hello, %s!", name));
    }
}
