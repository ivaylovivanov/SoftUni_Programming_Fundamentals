/**
 * Create a method for printing triangles as shown below:
 * 1
 * 1 2
 * 1 2 3
 * 1 2
 * 1
 * where 3 is the number entered from the keyboard by the user
 */
package Lab_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author There be Dragons
 */
public class P04_Printing_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintTriangle(n);
    }
    
    static void PrintTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
        
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j);
                if (j < n-i) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
