/**
 * A number is special when its sum of digits is 5, 7 or 11.
 * Write a program to read an integer n and for all numbers in the range 1…n to 
 * print the number and if it is special or not (True / False).
 */
package programming_fundamentals.Lab_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P06_Special_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 0;
        int sum = 0;
        int mod = 0;
        int div = 0;
        
        for (int i = 1; i <= num; i++) {
            
            temp = i;
            sum = 0;
            do {
                
                mod = temp % 10;
                div = temp / 10;
                temp = mod;
                sum = mod + div;
            } while (temp % 10 != temp);
        
            System.out.print(i);
            if (sum==5 || sum==7 || sum==11) {
                System.out.println(" -> True");
            } else {
                System.out.println(" -> False");
            }
        }
        
    }
}
