/**
 * Draw at the console a filled square of size n like in the example:
 * Input: 4
 * Output:
 * --------
 * -\/\/\/-
 * -\/\/\/-
 * --------
 */
package Lab_Methods_and_Debugging;

import java.util.Scanner;


/**
 *
 * @author There Be Dragons
 */
public class P05_Draw_a_Filled_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintHeaderRow("-", n*2);
        for (int i = 0; i < n-2; i++) {
            PrintMiddleRow(n);
        }
        PrintHeaderRow("-", n*2);
    }
    
    static void PrintHeaderRow(String input, int n){
        String row = input;
        for (int i = 1; i < n; i++) {
            row += input; 
        }
        System.out.println(row);
    }
    
    static void PrintMiddleRow(int n){
        System.out.print("-");
        for (int i = 1; i < n; i++) {
            System.out.print("\\/");
        }
        System.out.println("-");
    }
}