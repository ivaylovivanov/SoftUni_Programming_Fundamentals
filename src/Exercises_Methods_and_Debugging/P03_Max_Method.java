/**
 * Create a method GetMax(int a, int b), that returns maximal of two numbers. 
 * Write a program that reads three numbers from the console and prints the 
 * biggest of them. Use the GetMax(…) method you just created.
 */
package Exercises_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author There be Dragons
 */
public class P03_Max_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println(GetMax(GetMax(a, b), GetMax(b, c)));
    }
    
    static int GetMax(int a, int b){
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
